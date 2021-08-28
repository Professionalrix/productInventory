/*
 * package com.product.managment.webapp.services.impl;
 * 
 * import java.util.ArrayList; import java.util.Date; import java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service; import
 * org.springframework.transaction.annotation.Transactional;
 * 
 * import com.product.managment.webapp.entities.ResponseFromDate; import
 * com.product.managment.webapp.entities.StockLedger; import
 * com.product.managment.webapp.entities.TransactionDetail; import
 * com.product.managment.webapp.entities.TransactionHead; import
 * com.product.managment.webapp.model.ResponseClass; import
 * com.product.managment.webapp.model.ResponseStockTracking; import
 * com.product.managment.webapp.repositories.ProductRepository; import
 * com.product.managment.webapp.repositories.TransactionDetailRepository; import
 * com.product.managment.webapp.repositories.TransactionHeadRepository; import
 * com.product.managment.webapp.services.TransactionHeadService;
 * 
 * @Service
 * 
 * @Transactional public class TransactionHeadServiceImpl {
 * 
 * @Autowired private TransactionHeadRepository transactionHeadRepository;
 * 
 * @Autowired private TransactionDetailRepository transactionDetailRepository;
 * 
 * @Autowired private ProductRepository productRepository;
 * 
 * //@Autowired
 * 
 * @Override
 * 
 * @Transactional public TransactionHead insert(TransactionHead transactionHead)
 * {
 * 
 * return transactionHeadRepository.save(transactionHead); }
 * 
 * @Override public Iterable<TransactionHead> getAllTransaction() { return
 * transactionHeadRepository.findAll(); }
 * 
 * @Override public TransactionHead getFindById(Long id) {
 * 
 * return transactionHeadRepository.findById(id).get(); }
 * 
 * @Override public void deleteTransaction(Long id) {
 * transactionHeadRepository.deleteById(id); }
 * 
 * @Override public double formDate(Long productId, Long StoreId, Date date) {
 * double inwardQuantity = 0; double outwardQuantity = 0; ResponseFromDate
 * response = new ResponseFromDate(); List<TransactionHead> txnHead =
 * transactionHeadRepository.findAllWithCreationDateTimeBefore(date, StoreId);
 * for (TransactionHead txnHeadList : txnHead) {
 * 
 * if (txnHeadList.getType().equals("outward")) {
 * 
 * List<TransactionDetail> txnDetailList = transactionDetailRepository
 * .getTransactionfromDate(txnHeadList.getId(), productId);
 * 
 * for (TransactionDetail txnDetail : txnDetailList) { outwardQuantity +=
 * txnDetail.getQuantity(); response.setOutwardQuantity(outwardQuantity); } }
 * else { List<TransactionDetail> txnDetailList = transactionDetailRepository
 * .getTransactionfromDate(txnHeadList.getId(), productId);
 * 
 * for (TransactionDetail txnDetail : txnDetailList) { inwardQuantity +=
 * txnDetail.getQuantity();
 * 
 * } } } System.out.println("Total inward :" + inwardQuantity);
 * System.out.println("Total outward :" + outwardQuantity);
 * System.out.println("Net Quantity : " + (inwardQuantity - outwardQuantity));
 * response.setNetQuantity(inwardQuantity - outwardQuantity); return
 * (inwardQuantity - outwardQuantity); }
 * 
 * @Override public ResponseClass betweenDate(Long productId, Long storeId, Date
 * startDate, Date endDate) {
 * 
 * ResponseClass response = new ResponseClass(); List<ResponseClass>
 * responseList = new ArrayList<>();
 * 
 * double inwardQuantity = 0; double outwardQuantity = 0;
 * 
 * List<TransactionHead> txnHead =
 * transactionHeadRepository.findAllWithTransactionDateBetween(startDate,
 * endDate, storeId); for (TransactionHead txnHeadList : txnHead) {
 * 
 * if (txnHeadList.getType().equals("outward")) {
 * 
 * List<TransactionDetail> txnDetailList = transactionDetailRepository
 * .getTransactionfromDate(txnHeadList.getId(), productId);
 * 
 * for (TransactionDetail txnDetail : txnDetailList) {
 * 
 * 
 * outwardQuantity += txnDetail.getQuantity(); }
 * response.setSupplierName(txnHeadList.getSupplier().getSupplierName());
 * response.setProductId(productId); } else { List<TransactionDetail>
 * txnDetailList = transactionDetailRepository
 * .getTransactionfromDate(txnHeadList.getId(), productId);
 * 
 * for (TransactionDetail txnDetail : txnDetailList) { inwardQuantity +=
 * txnDetail.getQuantity();
 * 
 * }
 * 
 * }
 * 
 * } // response.setOpeningStock(openingStock);
 * response.setOutwardQwantity(outwardQuantity);
 * response.setInwardQuantity(inwardQuantity);
 * response.setClosingStock((inwardQuantity - outwardQuantity));
 * System.out.println(outwardQuantity); System.out.println(inwardQuantity);
 * System.out.println("Net Quantity :" + (inwardQuantity - outwardQuantity));
 * return response; }
 * 
 * 
 * 
 * @Override public void transactionBetweenDate(StockLedger stockLedger) {
 * double inwardQuantity = 0; double outwardQuantity = 0; //
 * List<TransactionHead> txnHead = //
 * transactionHeadRepository.transactionBetweenDate(stockLedger.getFromDate(),
 * stockLedger.getToDate(),stockLedger.getStoreId());
 * System.out.println("hello"); }
 * 
 * 
 * 
 * 
 *//***************************************************************************************/
/*

*//***************************************************************************************//*
																							 * 
																							 * stock tracking
																							 * 
																							 * @Override public List<
																							 * ResponseStockTracking>
																							 * stockTracking(StockLedger
																							 * stockLedger) {
																							 * 
																							 * List<
																							 * ResponseStockTracking>
																							 * responseList= new
																							 * ArrayList<>();
																							 * ResponseStockTracking
																							 * response =new
																							 * ResponseStockTracking();
																							 * double inwardQuantity =
																							 * 0; double outwardQuantity
																							 * = 0;
																							 * 
																							 * List<TransactionHead>
																							 * txnHead =
																							 * transactionHeadRepository
																							 * .stockTracking(
																							 * stockLedger.getFromDate()
																							 * ,
																							 * stockLedger.getToDate(),
																							 * stockLedger.getStoreId())
																							 * ; List<TransactionHead>
																							 * txnHead1 =
																							 * transactionHeadRepository
																							 * .
																							 * findAllWithCreationDateTimeBefore
																							 * (stockLedger.getFromDate(
																							 * ),
																							 * stockLedger.getStoreId())
																							 * ; List<TransactionHead>
																							 * txnHead2 =
																							 * transactionHeadRepository
																							 * .
																							 * findAllWithTransactionDateBetween
																							 * (stockLedger.getFromDate(
																							 * ),
																							 * stockLedger.getToDate(),
																							 * stockLedger.getStoreId())
																							 * ;
																							 * 
																							 * for (TransactionHead
																							 * txnHeadList : txnHead2) {
																							 * if
																							 * (txnHeadList.getType().
																							 * equals("outward")) {
																							 * List<TransactionDetail>
																							 * txnDetailList =
																							 * transactionDetailRepository
																							 * .getTransactionfromDate(
																							 * txnHeadList.getId(),
																							 * stockLedger.getProductId(
																							 * )); for
																							 * (TransactionDetail
																							 * txnDetail :
																							 * txnDetailList) {
																							 * outwardQuantity +=
																							 * txnDetail.getQuantity();
																							 * }
																							 * 
																							 * } else {
																							 * List<TransactionDetail>
																							 * txnDetailList =
																							 * transactionDetailRepository
																							 * .getTransactionfromDate(
																							 * txnHeadList.getId(),
																							 * stockLedger.getProductId(
																							 * )); for
																							 * (TransactionDetail
																							 * txnDetail :
																							 * txnDetailList) {
																							 * inwardQuantity +=
																							 * txnDetail.getQuantity();
																							 * 
																							 * } } }
																							 * 
																							 * response.
																							 * setTotalInQuantity(
																							 * inwardQuantity);
																							 * response.
																							 * setTotalOutQuantity(
																							 * outwardQuantity);
																							 * 
																							 * inwardQuantity=0;
																							 * outwardQuantity=0;
																							 * 
																							 * for (TransactionHead
																							 * txnHeadList : txnHead1) {
																							 * if
																							 * (txnHeadList.getType().
																							 * equals("outward")) {
																							 * List<TransactionDetail>
																							 * txnDetailList =
																							 * transactionDetailRepository
																							 * .getTransactionfromDate(
																							 * txnHeadList.getId(),
																							 * stockLedger.getProductId(
																							 * ));
																							 * 
																							 * for (TransactionDetail
																							 * txnDetail :
																							 * txnDetailList) {
																							 * outwardQuantity +=
																							 * txnDetail.getQuantity();
																							 * }
																							 * 
																							 * } else {
																							 * List<TransactionDetail>
																							 * txnDetailList =
																							 * transactionDetailRepository
																							 * .getTransactionfromDate(
																							 * txnHeadList.getId(),
																							 * stockLedger.getProductId(
																							 * ));
																							 * 
																							 * for (TransactionDetail
																							 * txnDetail :
																							 * txnDetailList) {
																							 * inwardQuantity +=
																							 * txnDetail.getQuantity();
																							 * 
																							 * }
																							 * 
																							 * }
																							 * 
																							 * } double closingQuantity=
																							 * inwardQuantity-
																							 * outwardQuantity;
																							 * 
																							 * for(TransactionHead
																							 * txnHeadList: txnHead) {
																							 * List<TransactionDetail>
																							 * txnDetailList =
																							 * transactionDetailRepository
																							 * .getTransactionfromDate(
																							 * txnHeadList.getId(),
																							 * stockLedger.getProductId(
																							 * ));
																							 * 
																							 * for (TransactionDetail
																							 * txnDetail :
																							 * txnDetailList) { response
																							 * = new
																							 * ResponseStockTracking();
																							 * response.
																							 * setTransactionDate(
																							 * txnHeadList.
																							 * getTransactionDate());
																							 * response.setUnit("PCS");
																							 * response.setTransactionNo
																							 * (txnHeadList.getId());
																							 * response.
																							 * setTranscationType(
																							 * txnHeadList.getType());
																							 * 
																							 * if(txnHeadList.getType().
																							 * equals("outward")) {
																							 * response.setOutQuantity(
																							 * txnDetail.getQuantity());
																							 * }else {
																							 * response.setInQuantity(
																							 * txnDetail.getQuantity());
																							 * }
																							 * 
																							 * response.setBalQuantity((
																							 * closingQuantity+response.
																							 * getInQuantity()-response.
																							 * getOutQuantity()));
																							 * responseList.add(response
																							 * ); }
																							 * 
																							 * //closingQuantity=
																							 * closingQuantity+response.
																							 * getInQuantity()-response.
																							 * getOutQuantity(); }
																							 * 
																							 * 
																							 * 
																							 * return responseList; } }
																							 */
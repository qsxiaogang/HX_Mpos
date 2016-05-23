package com.lk.td.pay.activity.main.cashin.swing.audio;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


import com.bbpos.emvswipe.CAPK;
import com.bbpos.emvswipe.EmvSwipeController.AutoConfigError;
import com.bbpos.emvswipe.EmvSwipeController.BatteryStatus;
import com.bbpos.emvswipe.EmvSwipeController.CheckCardMode;
import com.bbpos.emvswipe.EmvSwipeController.CheckCardResult;
import com.bbpos.emvswipe.EmvSwipeController.DisplayText;
import com.bbpos.emvswipe.EmvSwipeController.EmvSwipeControllerListener;
import com.bbpos.emvswipe.EmvSwipeController.Error;
import com.bbpos.emvswipe.EmvSwipeController.NfcDataExchangeStatus;
import com.bbpos.emvswipe.EmvSwipeController.StartEmvResult;
import com.bbpos.emvswipe.EmvSwipeController.TerminalSettingStatus;
import com.bbpos.emvswipe.EmvSwipeController.TransactionResult;

public class MyEmvSwipeControllerListener implements EmvSwipeControllerListener {

	private ISwingCardThroughAudio iSwingCard;
	
	public MyEmvSwipeControllerListener(ISwingCardThroughAudio iSwingCard){
		
		this.iSwingCard=iSwingCard;
		
	}
	
	public void onWaitingForCard() {
		if(iSwingCard != null) iSwingCard.onWaitingForCard();
	}
	@Override
	public void onReturnCheckCardResult(CheckCardResult checkCardResult, Hashtable<String, String> decodeData) {
		if(iSwingCard != null) iSwingCard.onReturnCheckCardResult(checkCardResult, decodeData);
	}
	@Override
	public void onReturnCancelCheckCardResult(boolean isSuccess) {
		if(iSwingCard != null) iSwingCard.onReturnCancelCheckCardResult(isSuccess);
	}
	public void onReturnEncryptPinResult(String epb, String ksn) {
		if(iSwingCard != null) iSwingCard.onReturnEncryptPinResult(epb, ksn);
	}
	public void onReturnEncryptDataResult(String encryptedData, String ksn) {
		if(iSwingCard != null) iSwingCard.onReturnEncryptDataResult(encryptedData, ksn);
	}
	@Override
	public void onReturnStartEmvResult(StartEmvResult result, String ksn) {
		if(iSwingCard != null) iSwingCard.onReturnStartEmvResult(result, ksn);
	}
	@Override
	public void onReturnDeviceInfo(Hashtable<String, String> deviceInfoData) {
		if(iSwingCard != null) iSwingCard.onReturnDeviceInfo(deviceInfoData);
	}
	@Override
	@Deprecated
	public void onReturnTransactionResult(TransactionResult transResult) {
		if(iSwingCard != null) iSwingCard.onReturnTransactionResult(transResult);
	}
	@Override
	public void onReturnTransactionResult(TransactionResult transResult, Hashtable<String, String> data) {
		if(iSwingCard != null) iSwingCard.onReturnTransactionResult(transResult, data);
	}
	@Override
	public void onReturnBatchData(String tlv) {
		if(iSwingCard != null) iSwingCard.onReturnBatchData(tlv);
	}
	@Override
	public void onReturnTransactionLog(String tlv) {
		if(iSwingCard != null) iSwingCard.onReturnTransactionLog(tlv);
	}
	@Override
	public void onReturnReversalData(String tlv) {
		if(iSwingCard != null) iSwingCard.onReturnReversalData(tlv);
	}
	@Override
	public void onReturnPowerOnIccResult(boolean isSuccess, String ksn, String atr, int atrLength) {
		if(iSwingCard != null) iSwingCard.onReturnPowerOnIccResult(isSuccess, ksn, atr, atrLength);
	}
	@Override
	public void onReturnPowerOffIccResult(boolean isSuccess) {
		if(iSwingCard != null) iSwingCard.onReturnPowerOffIccResult(isSuccess);
	}
	@Override
	public void onReturnApduResult(boolean isSuccess, String apdu, int apduLength) {
		if(iSwingCard != null) iSwingCard.onReturnApduResult(isSuccess, apdu, apduLength);
	}
	@Override
	public void onReturnApduResultWithPkcs7Padding(boolean isSuccess, String apdu) {
		if(iSwingCard != null) iSwingCard.onReturnApduResultWithPkcs7Padding(isSuccess, apdu);
	}
	@Override
	public void onReturnViposBatchExchangeApduResult(Hashtable<Integer, String> data) {
		if(iSwingCard != null) iSwingCard.onReturnBatchExchangeApduResult(data);
	}
	@Override
	public void onReturnViposExchangeApduResult(String apdu) {
		if(iSwingCard != null) iSwingCard.onReturnExchangeApduResult(apdu);
	}
	@Override
	public void onReturnEmvCardDataResult(boolean isSuccess, String tlv) {
		if(iSwingCard != null) iSwingCard.onReturnEmvCardDataResult(isSuccess, tlv);
	}
	@Override
	public void onReturnEmvCardNumber(String cardNumber) {
		if(iSwingCard != null) iSwingCard.onReturnEmvCardNumber(cardNumber);
	}
	@Override
	public void onReturnPowerOnNfcResult(boolean isSuccess, String response, int responseLength) {
		if(iSwingCard != null) iSwingCard.onReturnPowerOnNfcResult(isSuccess, response, responseLength);
	}
	@Override
	public void onReturnPowerOffNfcResult(boolean isSuccess) {
		if(iSwingCard != null) iSwingCard.onReturnPowerOffNfcResult(isSuccess);
	}
	@Override
	public void onReturnNfcDataResult(NfcDataExchangeStatus nfcDataExchangeStatus, String data, int dataLength) {
		if(iSwingCard != null) iSwingCard.onReturnNfcDataResult(nfcDataExchangeStatus, data, dataLength);
	}
	@Override
	public void onReturnKsn(Hashtable<String, String> ksntable) {
		if(iSwingCard != null) iSwingCard.onReturnKsn(ksntable);
	}
	@Override
	public void onReturnUpdateTerminalSettingResult(TerminalSettingStatus terminalSettingStatus) {
		if(iSwingCard != null) iSwingCard.onReturnUpdateTerminalSettingResult(terminalSettingStatus);
	}
	@Override
	public void onReturnReadTerminalSettingResult(TerminalSettingStatus terminalSettingStatus, String value) {
		if(iSwingCard != null) iSwingCard.onReturnReadTerminalSettingResult(terminalSettingStatus, value);
	}
	@Override
	public void onRequestSelectApplication(ArrayList<String> appList) {
		if(iSwingCard != null) iSwingCard.onRequestSelectApplication(appList);
	}
	@Override
	public void onRequestSetAmount() {
		if(iSwingCard != null) iSwingCard.onRequestSetAmount();
	}
	@Override
	public void onRequestPinEntry() {
		if(iSwingCard != null) iSwingCard.onRequestPinEntry();
	}
	@Override
	public void onRequestVerifyID(String tlv) {
		if(iSwingCard != null) iSwingCard.onRequestVerifyID(tlv);
	}
	@Override
	public void onRequestCheckServerConnectivity() {
		if(iSwingCard != null) iSwingCard.onRequestCheckServerConnectivity();
	}
	@Override
	public void onRequestOnlineProcess(String tlv) {
		if(iSwingCard != null) iSwingCard.onRequestOnlineProcess(tlv);
	}
	@Override
	public void onRequestTerminalTime() {
		if(iSwingCard != null) iSwingCard.onRequestTerminalTime();
	}
	@Override
	public void onRequestDisplayText(DisplayText displayText) {
		if(iSwingCard != null) iSwingCard.onRequestDisplayText(displayText);
	}
	@Override
	public void onRequestClearDisplay() {
		if(iSwingCard != null) iSwingCard.onRequestClearDisplay();
	}
	@Override
	public void onRequestReferProcess(String pan) {
		if(iSwingCard != null) iSwingCard.onRequestReferProcess(pan);
	}
	@Override
	public void onRequestAdviceProcess(String tlv) {
		if(iSwingCard != null) iSwingCard.onRequestAdviceProcess(tlv);
	}
	@Override
	public void onRequestFinalConfirm() {
		if(iSwingCard != null) iSwingCard.onRequestFinalConfirm();
	}
	@Override
	public void onAutoConfigProgressUpdate(double percentage) {
		if(iSwingCard != null) iSwingCard.onAutoConfigProgressUpdate(percentage);
	}
	@Override
	public void onAutoConfigCompleted(boolean isDefaultSettings, String autoConfigSettings) {
		if(iSwingCard != null) iSwingCard.onAutoConfigCompleted(isDefaultSettings, autoConfigSettings);
	}
	@Override
	public void onAutoConfigError(AutoConfigError autoConfigError) {
		if(iSwingCard != null) iSwingCard.onAutoConfigError(autoConfigError);
	}
	@Override
	public void onBatteryLow(BatteryStatus batteryStatus) {
		if(iSwingCard != null) iSwingCard.onBatteryLow(batteryStatus);
	}
	@Override
	public void onNoDeviceDetected() {
		if(iSwingCard != null) iSwingCard.onNoDeviceDetected();
	}
	@Override
	public void onDevicePlugged() {
		if(iSwingCard != null) iSwingCard.onDevicePlugged();
	}
	@Override
	public void onDeviceUnplugged() {
		if(iSwingCard != null) iSwingCard.onDeviceUnplugged();
	}
	@Override
	public void onDeviceHere(boolean isHere) {
		if(iSwingCard != null) iSwingCard.onDeviceHere(isHere);
	}
	@Override
	public void onError(Error errorState) {
		if(iSwingCard != null) iSwingCard.onError(errorState);
	}
	@Override
	public void onPowerDown() {
		if(iSwingCard != null) iSwingCard.onPowerDown();
	}
	
	
	
	/**
	 * 设置音频刷卡器的回调接口
	 * @author Administrator
	 *
	 */
	public interface ISwingCardThroughAudio {

		public abstract void onWaitingForCard();
		public abstract void onReturnCheckCardResult(CheckCardResult checkCardResult, Hashtable<String, String> decodeData);
		public abstract void onReturnCancelCheckCardResult(boolean isSuccess);
		public abstract void onReturnEncryptPinResult(String epb, String ksn);
		public abstract void onReturnEncryptDataResult(String encryptedData, String ksn);
		public abstract void onReturnStartEmvResult(StartEmvResult result, String ksn);
		/**
		 * 获得设备的基本信息
		 * @param deviceInfoData
		 */
		public abstract void onReturnDeviceInfo(Hashtable<String, String> deviceInfoData);
		@Deprecated
		public abstract void onReturnTransactionResult(TransactionResult transResult);
		public abstract void onReturnTransactionResult(TransactionResult transResult, Hashtable<String, String> data);
		public abstract void onReturnBatchData(String tlv);
		public abstract void onReturnTransactionLog(String tlv);
		public abstract void onReturnReversalData(String tlv);
		public abstract void onReturnPowerOnIccResult(boolean isSuccess, String ksn, String atr, int atrLength);
		public abstract void onReturnPowerOffIccResult(boolean isSuccess);
		public abstract void onReturnApduResult(boolean isSuccess, String apdu, int apduLength);
		public abstract void onReturnApduResultWithPkcs7Padding(boolean isSuccess, String apdu);
		public abstract void onReturnExchangeApduResult(String apdu);
		public abstract void onReturnBatchExchangeApduResult(Hashtable<Integer, String> data);
		public abstract void onReturnEmvCardDataResult(boolean isSuccess, String tlv);
		public abstract void onReturnEmvCardNumber(String cardNumber);
		public abstract void onReturnPowerOnNfcResult(boolean isSuccess, String response, int responseLength);
		public abstract void onReturnPowerOffNfcResult(boolean isSuccess);
		public abstract void onReturnNfcDataResult(NfcDataExchangeStatus nfcDataExchangeStatus, String data, int dataLength);
		public abstract void onReturnKsn(Hashtable<String, String> ksntable);
		public abstract void onReturnUpdateTerminalSettingResult(TerminalSettingStatus terminalSettingStatus);
		public abstract void onReturnReadTerminalSettingResult(TerminalSettingStatus terminalSettingStatus, String value);
		public abstract void onRequestSelectApplication(ArrayList<String> appList);
		public abstract void onRequestSetAmount();
		public abstract void onRequestPinEntry();
		public abstract void onRequestVerifyID(String tlv);
		public abstract void onRequestCheckServerConnectivity();
		public abstract void onRequestOnlineProcess(String tlv);
		public abstract void onRequestTerminalTime();
		public abstract void onRequestDisplayText(DisplayText displayText);
		public abstract void onRequestClearDisplay();
		public abstract void onRequestReferProcess(String pan);
		public abstract void onRequestAdviceProcess(String tlv);
		public abstract void onRequestFinalConfirm();
		public abstract void onAutoConfigProgressUpdate(double percentage);
		public abstract void onAutoConfigCompleted(boolean isDefaultSettings, String autoConfigSettings);
		public abstract void onAutoConfigError(AutoConfigError autoConfigError);
		public abstract void onBatteryLow(BatteryStatus batteryStatus);
		public abstract void onNoDeviceDetected();
		public abstract void onDevicePlugged();
		public abstract void onDeviceUnplugged();
		public abstract void onDeviceHere(boolean isHere);
		public abstract void onError(Error errorState);
		public abstract void onPowerDown();
		
	}



	@Override
	public void onReturnCAPKDetail(CAPK arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnCAPKList(List<CAPK> arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnCAPKLocation(String arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnEmvCardBalance(boolean arg0, String arg1) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnEmvLoadLog(String[] arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnEmvReport(String arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnEmvReportList(Hashtable<String, String> arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnEmvTransactionLog(String[] arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnEncryptPinResult(Hashtable<String, String> arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnUpdateCAPKResult(boolean arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onWaitingForCard(CheckCardMode arg0) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onBatchDataDetected() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onOnlineProcessDataDetected() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReturnEncryptDataResult(boolean arg0,
			Hashtable<String, String> arg1) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void onReversalDataDetected() {
		// TODO 自动生成的方法存根
		
	}
	
}
package actions;

//エラー発生時に処理を行うActionクラス

import java.io.IOException;

import javax.servlet.ServletException;

import constants.ForwardConst;

//エラー発生時の処理を行うActionクラス
public class UnknownAction extends ActionBase {
	/*共通エラー画面「お探しのページは見つかりませんでした」を表示する*/
	@Override
	public void process() throws ServletException,IOException{
		//エラー画面を表示
		/*ちなみに引数の中は定数ファイル『ForwardConst』で定義した
		 * jspファイルのパス「FW_ERR_UNKNOWN」です。
		 */
		forward(ForwardConst.FW_ERR_UNKNOWN);
	}
}

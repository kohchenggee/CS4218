package sg.edu.nus.comp.cs4218.impl.app;

import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.app.Wc;
import sg.edu.nus.comp.cs4218.exception.WcException;

public class WcApplication implements Wc {

	@Override
	public void run(String[] args, InputStream stdin, OutputStream stdout) throws WcException {
		// TODO Auto-generated method stub
		System.out.println("wc");
	}

	@Override
	public String printCharacterCountInFile(String args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printWordCountInFile(String args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printNewlineCountInFile(String args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printAllCountsInFile(String args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printCharacterCountInStdin(String args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printWordCountInStdin(String args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printNewlineCountInStdin(String args) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String printAllCountsInStdin(String args) {
		// TODO Auto-generated method stub
		return null;
	}

}

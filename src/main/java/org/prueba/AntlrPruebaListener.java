package org.prueba;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.prueba.MongoParser.ArrayContext;
import org.prueba.MongoParser.ArrayElementContext;
import org.prueba.MongoParser.DocContext;
import org.prueba.MongoParser.JsonContext;
import org.prueba.MongoParser.KeyContext;
import org.prueba.MongoParser.MainContext;
import org.prueba.MongoParser.RootMongoContext;
import org.prueba.MongoParser.TuplesContext;
import org.prueba.MongoParser.ValueContext;

public class AntlrPruebaListener implements MongoListener{

	@Override
	public void visitTerminal(TerminalNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitErrorNode(ErrorNode node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitEveryRule(ParserRuleContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterRootMongo(RootMongoContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitRootMongo(RootMongoContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterMain(MainContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitMain(MainContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterArrayElement(ArrayElementContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArrayElement(ArrayElementContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.getText());
		
	}

	@Override
	public void enterArray(ArrayContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitArray(ArrayContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterDoc(DocContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitDoc(DocContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterJson(JsonContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitJson(JsonContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterTuples(TuplesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exitTuples(TuplesContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterKey(KeyContext ctx) {
		// TODO Auto-generated method stub
		System.out.println(ctx.getText());
		
	}

	@Override
	public void exitKey(KeyContext ctx) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void enterValue(ValueContext ctx) {
		// TODO Auto-generated method stub
		System.out.println("III");
		System.out.println(ctx.getText());
		System.out.println(ctx.doc());
		System.out.println("FFF");
		
		
	}

	@Override
	public void exitValue(ValueContext ctx) {
		// TODO Auto-generated method stub
		
	}

}

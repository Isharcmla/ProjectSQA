package org.jsoup.parser;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TokeniserStateTest {

    private Tokeniser createTokeniser(String input, TokeniserState initialState) {
        CharacterReader reader = new CharacterReader(input);
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(100));
        tokeniser.transition(initialState);
        return tokeniser;
    }

    private Tokeniser runRead(TokeniserState state, String input) {
        CharacterReader reader = new CharacterReader(input);
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(100));
        state.read(tokeniser, reader);
        return tokeniser;
    }

    private List<Token> tokenizeAll(String input, TokeniserState startState) {
        CharacterReader reader = new CharacterReader(input);
        Tokeniser tokeniser = new Tokeniser(reader, ParseErrorList.tracking(100));
        tokeniser.transition(startState);
        List<Token> tokens = new ArrayList<Token>();
        Token token;
        do {
            token = tokeniser.read();
            if (token != null) {
                tokens.add(token);
            }
        } while (token != null && !(token instanceof Token.EOF));
        return tokens;
    }

    @Test
    public void testEnumValuesAndValueOf() {
        TokeniserState[] states = TokeniserState.values();
        Assert.assertTrue(states.length > 0);
        Assert.assertEquals(TokeniserState.Data, TokeniserState.valueOf("Data"));
        Assert.assertEquals(TokeniserState.CdataSection, TokeniserState.valueOf("CdataSection"));
    }

    @Test
    public void testDataState_transitionsAndEmissions() {
        runRead(TokeniserState.Data, "&amp;");
        runRead(TokeniserState.Data, "<div>");
        runRead(TokeniserState.Data, "\u0000abc");
        runRead(TokeniserState.Data, "");
        runRead(TokeniserState.Data, "hello world");
    }

    @Test
    public void testCharacterReferenceInData_resolutions() {
        runRead(TokeniserState.CharacterReferenceInData, "&amp;");
        runRead(TokeniserState.CharacterReferenceInData, "foo");
    }

    @Test
    public void testRcdataState_branches() {
        runRead(TokeniserState.Rcdata, "&amp;");
        runRead(TokeniserState.Rcdata, "<title>");
        runRead(TokeniserState.Rcdata, "\u0000text");
        runRead(TokeniserState.Rcdata, "");
        runRead(TokeniserState.Rcdata, "simple rcdata");
    }

    @Test
    public void testCharacterReferenceInRcdata_reading() {
        runRead(TokeniserState.CharacterReferenceInRcdata, "&lt;");
    }

    @Test
    public void testRawtextState_branches() {
        runRead(TokeniserState.Rawtext, "<style>");
        runRead(TokeniserState.Rawtext, "\u0000raw");
        runRead(TokeniserState.Rawtext, "");
        runRead(TokeniserState.Rawtext, "raw text content");
    }

    @Test
    public void testScriptDataState_branches() {
        runRead(TokeniserState.ScriptData, "<script>");
        runRead(TokeniserState.ScriptData, "\u0000script");
        runRead(TokeniserState.ScriptData, "");
        runRead(TokeniserState.ScriptData, "var x = 1;");
    }

    @Test
    public void testPlaintextState_branches() {
        runRead(TokeniserState.PLAINTEXT, "\u0000plain");
        runRead(TokeniserState.PLAINTEXT, "");
        runRead(TokeniserState.PLAINTEXT, "some normal plaintext");
    }

    @Test
    public void testTagOpenState_branches() {
        runRead(TokeniserState.TagOpen, "!DOCTYPE");
        runRead(TokeniserState.TagOpen, "/div>");
        runRead(TokeniserState.TagOpen, "?xml");
        runRead(TokeniserState.TagOpen, "div>");
        runRead(TokeniserState.TagOpen, "123>");
    }

    @Test
    public void testEndTagOpenState_branches() {
        runRead(TokeniserState.EndTagOpen, "");
        runRead(TokeniserState.EndTagOpen, "div>");
        runRead(TokeniserState.EndTagOpen, ">");
        runRead(TokeniserState.EndTagOpen, "123");
    }

    @Test
    public void testTagNameState_branches() {
        CharacterReader r1 = new CharacterReader("div ");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(100));
        t1.createTagPending(true);
        TokeniserState.TagName.read(t1, r1);

        CharacterReader r2 = new CharacterReader("div/");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(100));
        t2.createTagPending(true);
        TokeniserState.TagName.read(t2, r2);

        CharacterReader r3 = new CharacterReader("div>");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(100));
        t3.createTagPending(true);
        TokeniserState.TagName.read(t3, r3);

        CharacterReader r4 = new CharacterReader("div\u0000");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(100));
        t4.createTagPending(true);
        TokeniserState.TagName.read(t4, r4);

        CharacterReader r5 = new CharacterReader("div");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(100));
        t5.createTagPending(true);
        TokeniserState.TagName.read(t5, r5);
    }

    @Test
    public void testRcdataLessthanSign_branches() {
        runRead(TokeniserState.RcdataLessthanSign, "/title>");

        CharacterReader r2 = new CharacterReader("b>other");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(100));
        t2.appropriateEndTagName = "title";
        TokeniserState.RcdataLessthanSign.read(t2, r2);

        runRead(TokeniserState.RcdataLessthanSign, "something");
    }

    @Test
    public void testRCDATAEndTagOpen_branches() {
        runRead(TokeniserState.RCDATAEndTagOpen, "title>");
        runRead(TokeniserState.RCDATAEndTagOpen, "123");
    }

    @Test
    public void testRCDATAEndTagName_branches() {
        CharacterReader r1 = new CharacterReader("title");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(100));
        t1.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t1, r1);

        CharacterReader r2 = new CharacterReader(" ");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(100));
        t2.createTagPending(false);
        t2.tagPending.appendTagName("title");
        t2.appropriateEndTagName = "title";
        TokeniserState.RCDATAEndTagName.read(t2, r2);

        CharacterReader r2b = new CharacterReader(" ");
        Tokeniser t2b = new Tokeniser(r2b, ParseErrorList.tracking(100));
        t2b.createTagPending(false);
        t2b.tagPending.appendTagName("other");
        t2b.appropriateEndTagName = "title";
        TokeniserState.RCDATAEndTagName.read(t2b, r2b);

        CharacterReader r3 = new CharacterReader("/");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(100));
        t3.createTagPending(false);
        t3.tagPending.appendTagName("title");
        t3.appropriateEndTagName = "title";
        TokeniserState.RCDATAEndTagName.read(t3, r3);

        CharacterReader r3b = new CharacterReader("/");
        Tokeniser t3b = new Tokeniser(r3b, ParseErrorList.tracking(100));
        t3b.createTagPending(false);
        t3b.tagPending.appendTagName("other");
        t3b.appropriateEndTagName = "title";
        TokeniserState.RCDATAEndTagName.read(t3b, r3b);

        CharacterReader r4 = new CharacterReader(">");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(100));
        t4.createTagPending(false);
        t4.tagPending.appendTagName("title");
        t4.appropriateEndTagName = "title";
        TokeniserState.RCDATAEndTagName.read(t4, r4);

        CharacterReader r4b = new CharacterReader(">");
        Tokeniser t4b = new Tokeniser(r4b, ParseErrorList.tracking(100));
        t4b.createTagPending(false);
        t4b.tagPending.appendTagName("other");
        t4b.appropriateEndTagName = "title";
        TokeniserState.RCDATAEndTagName.read(t4b, r4b);

        CharacterReader r5 = new CharacterReader("x");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(100));
        t5.createTagPending(false);
        TokeniserState.RCDATAEndTagName.read(t5, r5);
    }

    @Test
    public void testRawtextLessthanSign_branches() {
        runRead(TokeniserState.RawtextLessthanSign, "/style>");
        runRead(TokeniserState.RawtextLessthanSign, "style>");
    }

    @Test
    public void testRawtextEndTagOpen_branches() {
        runRead(TokeniserState.RawtextEndTagOpen, "style>");
        runRead(TokeniserState.RawtextEndTagOpen, "123");
    }

    @Test
    public void testRawtextEndTagName_branches() {
        CharacterReader r1 = new CharacterReader("style");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(100));
        t1.createTagPending(false);
        TokeniserState.RawtextEndTagName.read(t1, r1);

        CharacterReader r2 = new CharacterReader(" >");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(100));
        t2.createTagPending(false);
        t2.tagPending.appendTagName("style");
        t2.appropriateEndTagName = "style";
        TokeniserState.RawtextEndTagName.read(t2, r2);

        CharacterReader r3 = new CharacterReader("/>");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(100));
        t3.createTagPending(false);
        t3.tagPending.appendTagName("style");
        t3.appropriateEndTagName = "style";
        TokeniserState.RawtextEndTagName.read(t3, r3);

        CharacterReader r4 = new CharacterReader(">");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(100));
        t4.createTagPending(false);
        t4.tagPending.appendTagName("style");
        t4.appropriateEndTagName = "style";
        TokeniserState.RawtextEndTagName.read(t4, r4);

        CharacterReader r5 = new CharacterReader("x");
        Tokeniser t5 = new Tokeniser(r5, ParseErrorList.tracking(100));
        t5.createTagPending(false);
        t5.tagPending.appendTagName("style");
        t5.appropriateEndTagName = "style";
        TokeniserState.RawtextEndTagName.read(t5, r5);

        CharacterReader r6 = new CharacterReader(" ");
        Tokeniser t6 = new Tokeniser(r6, ParseErrorList.tracking(100));
        t6.createTagPending(false);
        t6.tagPending.appendTagName("other");
        t6.appropriateEndTagName = "style";
        TokeniserState.RawtextEndTagName.read(t6, r6);
    }

    @Test
    public void testScriptDataLessthanSign_branches() {
        runRead(TokeniserState.ScriptDataLessthanSign, "/script>");
        runRead(TokeniserState.ScriptDataLessthanSign, "!--");
        runRead(TokeniserState.ScriptDataLessthanSign, "abc");
    }

    @Test
    public void testScriptDataEndTagOpen_branches() {
        runRead(TokeniserState.ScriptDataEndTagOpen, "script>");
        runRead(TokeniserState.ScriptDataEndTagOpen, "123");
    }

    @Test
    public void testScriptDataEndTagName_branches() {
        CharacterReader r1 = new CharacterReader("script");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(100));
        t1.createTagPending(false);
        TokeniserState.ScriptDataEndTagName.read(t1, r1);
    }

    @Test
    public void testScriptDataEscapeStart_branches() {
        runRead(TokeniserState.ScriptDataEscapeStart, "-");
        runRead(TokeniserState.ScriptDataEscapeStart, "x");
    }

    @Test
    public void testScriptDataEscapeStartDash_branches() {
        runRead(TokeniserState.ScriptDataEscapeStartDash, "-");
        runRead(TokeniserState.ScriptDataEscapeStartDash, "x");
    }

    @Test
    public void testScriptDataEscaped_branches() {
        runRead(TokeniserState.ScriptDataEscaped, "");
        runRead(TokeniserState.ScriptDataEscaped, "-");
        runRead(TokeniserState.ScriptDataEscaped, "<");
        runRead(TokeniserState.ScriptDataEscaped, "\u0000");
        runRead(TokeniserState.ScriptDataEscaped, "abc");
    }

    @Test
    public void testScriptDataEscapedDash_branches() {
        runRead(TokeniserState.ScriptDataEscapedDash, "");
        runRead(TokeniserState.ScriptDataEscapedDash, "-");
        runRead(TokeniserState.ScriptDataEscapedDash, "<");
        runRead(TokeniserState.ScriptDataEscapedDash, "\u0000");
        runRead(TokeniserState.ScriptDataEscapedDash, "a");
    }

    @Test
    public void testScriptDataEscapedDashDash_branches() {
        runRead(TokeniserState.ScriptDataEscapedDashDash, "");
        runRead(TokeniserState.ScriptDataEscapedDashDash, "-");
        runRead(TokeniserState.ScriptDataEscapedDashDash, "<");
        runRead(TokeniserState.ScriptDataEscapedDashDash, ">");
        runRead(TokeniserState.ScriptDataEscapedDashDash, "\u0000");
        runRead(TokeniserState.ScriptDataEscapedDashDash, "a");
    }

    @Test
    public void testScriptDataEscapedLessthanSign_branches() {
        runRead(TokeniserState.ScriptDataEscapedLessthanSign, "s");
        runRead(TokeniserState.ScriptDataEscapedLessthanSign, "/script>");
        runRead(TokeniserState.ScriptDataEscapedLessthanSign, "1");
    }

    @Test
    public void testScriptDataEscapedEndTagOpen_branches() {
        runRead(TokeniserState.ScriptDataEscapedEndTagOpen, "script");
        runRead(TokeniserState.ScriptDataEscapedEndTagOpen, "1");
    }

    @Test
    public void testScriptDataEscapedEndTagName_branches() {
        CharacterReader r1 = new CharacterReader("script");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(100));
        t1.createTagPending(false);
        TokeniserState.ScriptDataEscapedEndTagName.read(t1, r1);
    }

    @Test
    public void testScriptDataDoubleEscapeStart_branches() {
        CharacterReader r1 = new CharacterReader("script");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(100));
        TokeniserState.ScriptDataDoubleEscapeStart.read(t1, r1);

        CharacterReader r2 = new CharacterReader(">");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(100));
        t2.dataBuffer.append("script");
        TokeniserState.ScriptDataDoubleEscapeStart.read(t2, r2);

        CharacterReader r3 = new CharacterReader(">");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(100));
        t3.dataBuffer.append("other");
        TokeniserState.ScriptDataDoubleEscapeStart.read(t3, r3);

        CharacterReader r4 = new CharacterReader("1");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(100));
        TokeniserState.ScriptDataDoubleEscapeStart.read(t4, r4);
    }

    @Test
    public void testScriptDataDoubleEscaped_branches() {
        runRead(TokeniserState.ScriptDataDoubleEscaped, "-");
        runRead(TokeniserState.ScriptDataDoubleEscaped, "<");
        runRead(TokeniserState.ScriptDataDoubleEscaped, "\u0000");
        runRead(TokeniserState.ScriptDataDoubleEscaped, "");
        runRead(TokeniserState.ScriptDataDoubleEscaped, "hello");
    }

    @Test
    public void testScriptDataDoubleEscapedDash_branches() {
        runRead(TokeniserState.ScriptDataDoubleEscapedDash, "-");
        runRead(TokeniserState.ScriptDataDoubleEscapedDash, "<");
        runRead(TokeniserState.ScriptDataDoubleEscapedDash, "\u0000");
        runRead(TokeniserState.ScriptDataDoubleEscapedDash, "");
        runRead(TokeniserState.ScriptDataDoubleEscapedDash, "a");
    }

    @Test
    public void testScriptDataDoubleEscapedDashDash_branches() {
        runRead(TokeniserState.ScriptDataDoubleEscapedDashDash, "-");
        runRead(TokeniserState.ScriptDataDoubleEscapedDashDash, "<");
        runRead(TokeniserState.ScriptDataDoubleEscapedDashDash, ">");
        runRead(TokeniserState.ScriptDataDoubleEscapedDashDash, "\u0000");
        runRead(TokeniserState.ScriptDataDoubleEscapedDashDash, "");
        runRead(TokeniserState.ScriptDataDoubleEscapedDashDash, "a");
    }

    @Test
    public void testScriptDataDoubleEscapedLessthanSign_branches() {
        runRead(TokeniserState.ScriptDataDoubleEscapedLessthanSign, "/script");
        runRead(TokeniserState.ScriptDataDoubleEscapedLessthanSign, "a");
    }

    @Test
    public void testScriptDataDoubleEscapeEnd_branches() {
        CharacterReader r1 = new CharacterReader("script");
        Tokeniser t1 = new Tokeniser(r1, ParseErrorList.tracking(100));
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t1, r1);

        CharacterReader r2 = new CharacterReader(">");
        Tokeniser t2 = new Tokeniser(r2, ParseErrorList.tracking(100));
        t2.dataBuffer.append("script");
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t2, r2);

        CharacterReader r3 = new CharacterReader(">");
        Tokeniser t3 = new Tokeniser(r3, ParseErrorList.tracking(100));
        t3.dataBuffer.append("other");
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t3, r3);

        CharacterReader r4 = new CharacterReader("1");
        Tokeniser t4 = new Tokeniser(r4, ParseErrorList.tracking(100));
        TokeniserState.ScriptDataDoubleEscapeEnd.read(t4, r4);
    }

    @Test
    public void testBeforeAttributeName_branches() {
        Tokeniser t = createTokeniser("div", TokeniserState.BeforeAttributeName);
        t.createTagPending(true);

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.BeforeAttributeName.read(t, r1);

        CharacterReader r2 = new CharacterReader("/");
        TokeniserState.BeforeAttributeName.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.BeforeAttributeName.read(t, r3);

        CharacterReader r4 = new CharacterReader("\u0000");
        TokeniserState.BeforeAttributeName.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.BeforeAttributeName.read(t, r5);

        CharacterReader r6 = new CharacterReader("\"");
        TokeniserState.BeforeAttributeName.read(t, r6);

        CharacterReader r7 = new CharacterReader("id");
        TokeniserState.BeforeAttributeName.read(t, r7);
    }

    @Test
    public void testAttributeName_branches() {
        Tokeniser t = createTokeniser("id", TokeniserState.AttributeName);
        t.createTagPending(true);
        t.tagPending.newAttribute();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.AttributeName.read(t, r1);

        CharacterReader r2 = new CharacterReader("/");
        TokeniserState.AttributeName.read(t, r2);

        CharacterReader r3 = new CharacterReader("=");
        TokeniserState.AttributeName.read(t, r3);

        CharacterReader r4 = new CharacterReader(">");
        TokeniserState.AttributeName.read(t, r4);

        CharacterReader r5 = new CharacterReader("\u0000");
        TokeniserState.AttributeName.read(t, r5);

        CharacterReader r6 = new CharacterReader("");
        TokeniserState.AttributeName.read(t, r6);

        CharacterReader r7 = new CharacterReader("\"");
        TokeniserState.AttributeName.read(t, r7);
    }

    @Test
    public void testAfterAttributeName_branches() {
        Tokeniser t = createTokeniser("id", TokeniserState.AfterAttributeName);
        t.createTagPending(true);
        t.tagPending.newAttribute();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.AfterAttributeName.read(t, r1);

        CharacterReader r2 = new CharacterReader("/");
        TokeniserState.AfterAttributeName.read(t, r2);

        CharacterReader r3 = new CharacterReader("=");
        TokeniserState.AfterAttributeName.read(t, r3);

        CharacterReader r4 = new CharacterReader(">");
        TokeniserState.AfterAttributeName.read(t, r4);

        CharacterReader r5 = new CharacterReader("\u0000");
        TokeniserState.AfterAttributeName.read(t, r5);

        CharacterReader r6 = new CharacterReader("");
        TokeniserState.AfterAttributeName.read(t, r6);

        CharacterReader r7 = new CharacterReader("\"");
        TokeniserState.AfterAttributeName.read(t, r7);

        CharacterReader r8 = new CharacterReader("class");
        TokeniserState.AfterAttributeName.read(t, r8);
    }

    @Test
    public void testBeforeAttributeValue_branches() {
        Tokeniser t = createTokeniser("val", TokeniserState.BeforeAttributeValue);
        t.createTagPending(true);
        t.tagPending.newAttribute();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.BeforeAttributeValue.read(t, r1);

        CharacterReader r2 = new CharacterReader("\"val\"");
        TokeniserState.BeforeAttributeValue.read(t, r2);

        CharacterReader r3 = new CharacterReader("&amp;");
        TokeniserState.BeforeAttributeValue.read(t, r3);

        CharacterReader r4 = new CharacterReader("'val'");
        TokeniserState.BeforeAttributeValue.read(t, r4);

        CharacterReader r5 = new CharacterReader("\u0000");
        TokeniserState.BeforeAttributeValue.read(t, r5);

        CharacterReader r6 = new CharacterReader("");
        TokeniserState.BeforeAttributeValue.read(t, r6);

        CharacterReader r7 = new CharacterReader(">");
        TokeniserState.BeforeAttributeValue.read(t, r7);

        CharacterReader r8 = new CharacterReader("<");
        TokeniserState.BeforeAttributeValue.read(t, r8);

        CharacterReader r9 = new CharacterReader("plain");
        TokeniserState.BeforeAttributeValue.read(t, r9);
    }

    @Test
    public void testAttributeValue_doubleQuoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AttributeValue_doubleQuoted);
        t.createTagPending(true);
        t.tagPending.newAttribute();

        CharacterReader r1 = new CharacterReader("\"");
        TokeniserState.AttributeValue_doubleQuoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("&amp;\"");
        TokeniserState.AttributeValue_doubleQuoted.read(t, r2);

        CharacterReader r3 = new CharacterReader("&zz;\"");
        TokeniserState.AttributeValue_doubleQuoted.read(t, r3);

        CharacterReader r4 = new CharacterReader("\u0000\"");
        TokeniserState.AttributeValue_doubleQuoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.AttributeValue_doubleQuoted.read(t, r5);
    }

    @Test
    public void testAttributeValue_singleQuoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AttributeValue_singleQuoted);
        t.createTagPending(true);
        t.tagPending.newAttribute();

        CharacterReader r1 = new CharacterReader("'");
        TokeniserState.AttributeValue_singleQuoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("&amp;'");
        TokeniserState.AttributeValue_singleQuoted.read(t, r2);

        CharacterReader r3 = new CharacterReader("&zz;'");
        TokeniserState.AttributeValue_singleQuoted.read(t, r3);

        CharacterReader r4 = new CharacterReader("\u0000'");
        TokeniserState.AttributeValue_singleQuoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.AttributeValue_singleQuoted.read(t, r5);
    }

    @Test
    public void testAttributeValue_unquoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AttributeValue_unquoted);
        t.createTagPending(true);
        t.tagPending.newAttribute();

        CharacterReader r1 = new CharacterReader("val ");
        TokeniserState.AttributeValue_unquoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("&amp;");
        TokeniserState.AttributeValue_unquoted.read(t, r2);

        CharacterReader r3 = new CharacterReader("&zz;");
        TokeniserState.AttributeValue_unquoted.read(t, r3);

        CharacterReader r4 = new CharacterReader(">");
        TokeniserState.AttributeValue_unquoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("\u0000");
        TokeniserState.AttributeValue_unquoted.read(t, r5);

        CharacterReader r6 = new CharacterReader("");
        TokeniserState.AttributeValue_unquoted.read(t, r6);

        CharacterReader r7 = new CharacterReader("<");
        TokeniserState.AttributeValue_unquoted.read(t, r7);
    }

    @Test
    public void testAfterAttributeValue_quoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AfterAttributeValue_quoted);
        t.createTagPending(true);

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.AfterAttributeValue_quoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("/");
        TokeniserState.AfterAttributeValue_quoted.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.AfterAttributeValue_quoted.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.AfterAttributeValue_quoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("x");
        TokeniserState.AfterAttributeValue_quoted.read(t, r5);
    }

    @Test
    public void testSelfClosingStartTag_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.SelfClosingStartTag);
        t.createTagPending(true);

        CharacterReader r1 = new CharacterReader(">");
        TokeniserState.SelfClosingStartTag.read(t, r1);

        CharacterReader r2 = new CharacterReader("");
        TokeniserState.SelfClosingStartTag.read(t, r2);

        CharacterReader r3 = new CharacterReader("x");
        TokeniserState.SelfClosingStartTag.read(t, r3);
    }

    @Test
    public void testBogusComment_branch() {
        CharacterReader r = new CharacterReader("?comment>");
        Tokeniser t = new Tokeniser(r, ParseErrorList.tracking(100));
        TokeniserState.BogusComment.read(t, r);
    }

    @Test
    public void testMarkupDeclarationOpen_branches() {
        runRead(TokeniserState.MarkupDeclarationOpen, "-- comment -->");
        runRead(TokeniserState.MarkupDeclarationOpen, "DOCTYPE html>");
        runRead(TokeniserState.MarkupDeclarationOpen, "[CDATA[data]]>");
        runRead(TokeniserState.MarkupDeclarationOpen, "BOGUS");
    }

    @Test
    public void testCommentStart_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.CommentStart);
        t.createCommentPending();

        CharacterReader r1 = new CharacterReader("-");
        TokeniserState.CommentStart.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.CommentStart.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.CommentStart.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.CommentStart.read(t, r4);

        CharacterReader r5 = new CharacterReader("a");
        TokeniserState.CommentStart.read(t, r5);
    }

    @Test
    public void testCommentStartDash_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.CommentStartDash);
        t.createCommentPending();

        CharacterReader r1 = new CharacterReader("-");
        TokeniserState.CommentStartDash.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.CommentStartDash.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.CommentStartDash.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.CommentStartDash.read(t, r4);

        CharacterReader r5 = new CharacterReader("a");
        TokeniserState.CommentStartDash.read(t, r5);
    }

    @Test
    public void testComment_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.Comment);
        t.createCommentPending();

        CharacterReader r1 = new CharacterReader("-");
        TokeniserState.Comment.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.Comment.read(t, r2);

        CharacterReader r3 = new CharacterReader("");
        TokeniserState.Comment.read(t, r3);

        CharacterReader r4 = new CharacterReader("comment body");
        TokeniserState.Comment.read(t, r4);
    }

    @Test
    public void testCommentEndDash_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.CommentEndDash);
        t.createCommentPending();

        CharacterReader r1 = new CharacterReader("-");
        TokeniserState.CommentEndDash.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.CommentEndDash.read(t, r2);

        CharacterReader r3 = new CharacterReader("");
        TokeniserState.CommentEndDash.read(t, r3);

        CharacterReader r4 = new CharacterReader("a");
        TokeniserState.CommentEndDash.read(t, r4);
    }

    @Test
    public void testCommentEnd_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.CommentEnd);
        t.createCommentPending();

        CharacterReader r1 = new CharacterReader(">");
        TokeniserState.CommentEnd.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.CommentEnd.read(t, r2);

        CharacterReader r3 = new CharacterReader("!");
        TokeniserState.CommentEnd.read(t, r3);

        CharacterReader r4 = new CharacterReader("-");
        TokeniserState.CommentEnd.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.CommentEnd.read(t, r5);

        CharacterReader r6 = new CharacterReader("a");
        TokeniserState.CommentEnd.read(t, r6);
    }

    @Test
    public void testCommentEndBang_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.CommentEndBang);
        t.createCommentPending();

        CharacterReader r1 = new CharacterReader("-");
        TokeniserState.CommentEndBang.read(t, r1);

        CharacterReader r2 = new CharacterReader(">");
        TokeniserState.CommentEndBang.read(t, r2);

        CharacterReader r3 = new CharacterReader("\u0000");
        TokeniserState.CommentEndBang.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.CommentEndBang.read(t, r4);

        CharacterReader r5 = new CharacterReader("a");
        TokeniserState.CommentEndBang.read(t, r5);
    }

    @Test
    public void testDoctype_branches() {
        runRead(TokeniserState.Doctype, " ");
        runRead(TokeniserState.Doctype, "");
        runRead(TokeniserState.Doctype, ">");
        runRead(TokeniserState.Doctype, "x");
    }

    @Test
    public void testBeforeDoctypeName_branches() {
        runRead(TokeniserState.BeforeDoctypeName, "html");
        runRead(TokeniserState.BeforeDoctypeName, " ");
        runRead(TokeniserState.BeforeDoctypeName, "\u0000");
        runRead(TokeniserState.BeforeDoctypeName, "");
        runRead(TokeniserState.BeforeDoctypeName, "1");
    }

    @Test
    public void testDoctypeName_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.DoctypeName);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader("html");
        TokeniserState.DoctypeName.read(t, r1);

        CharacterReader r2 = new CharacterReader(">");
        TokeniserState.DoctypeName.read(t, r2);

        CharacterReader r3 = new CharacterReader(" ");
        TokeniserState.DoctypeName.read(t, r3);

        CharacterReader r4 = new CharacterReader("\u0000");
        TokeniserState.DoctypeName.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.DoctypeName.read(t, r5);

        CharacterReader r6 = new CharacterReader("1");
        TokeniserState.DoctypeName.read(t, r6);
    }

    @Test
    public void testAfterDoctypeName_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AfterDoctypeName);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader("");
        TokeniserState.AfterDoctypeName.read(t, r1);

        CharacterReader r2 = new CharacterReader(" ");
        TokeniserState.AfterDoctypeName.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.AfterDoctypeName.read(t, r3);

        CharacterReader r4 = new CharacterReader("PUBLIC");
        TokeniserState.AfterDoctypeName.read(t, r4);

        CharacterReader r5 = new CharacterReader("SYSTEM");
        TokeniserState.AfterDoctypeName.read(t, r5);

        CharacterReader r6 = new CharacterReader("INVALID");
        TokeniserState.AfterDoctypeName.read(t, r6);
    }

    @Test
    public void testAfterDoctypePublicKeyword_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AfterDoctypePublicKeyword);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.AfterDoctypePublicKeyword.read(t, r1);

        CharacterReader r2 = new CharacterReader("\"");
        TokeniserState.AfterDoctypePublicKeyword.read(t, r2);

        CharacterReader r3 = new CharacterReader("'");
        TokeniserState.AfterDoctypePublicKeyword.read(t, r3);

        CharacterReader r4 = new CharacterReader(">");
        TokeniserState.AfterDoctypePublicKeyword.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.AfterDoctypePublicKeyword.read(t, r5);

        CharacterReader r6 = new CharacterReader("a");
        TokeniserState.AfterDoctypePublicKeyword.read(t, r6);
    }

    @Test
    public void testBeforeDoctypePublicIdentifier_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.BeforeDoctypePublicIdentifier);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r1);

        CharacterReader r2 = new CharacterReader("\"");
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r2);

        CharacterReader r3 = new CharacterReader("'");
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r3);

        CharacterReader r4 = new CharacterReader(">");
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r5);

        CharacterReader r6 = new CharacterReader("a");
        TokeniserState.BeforeDoctypePublicIdentifier.read(t, r6);
    }

    @Test
    public void testDoctypePublicIdentifier_doubleQuoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.DoctypePublicIdentifier_doubleQuoted);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader("\"");
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("a");
        TokeniserState.DoctypePublicIdentifier_doubleQuoted.read(t, r5);
    }

    @Test
    public void testDoctypePublicIdentifier_singleQuoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.DoctypePublicIdentifier_singleQuoted);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader("'");
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("a");
        TokeniserState.DoctypePublicIdentifier_singleQuoted.read(t, r5);
    }

    @Test
    public void testAfterDoctypePublicIdentifier_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AfterDoctypePublicIdentifier);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r1);

        CharacterReader r2 = new CharacterReader(">");
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r2);

        CharacterReader r3 = new CharacterReader("\"");
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r3);

        CharacterReader r4 = new CharacterReader("'");
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r5);

        CharacterReader r6 = new CharacterReader("a");
        TokeniserState.AfterDoctypePublicIdentifier.read(t, r6);
    }

    @Test
    public void testBetweenDoctypePublicAndSystemIdentifiers_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.BetweenDoctypePublicAndSystemIdentifiers);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r1);

        CharacterReader r2 = new CharacterReader(">");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r2);

        CharacterReader r3 = new CharacterReader("\"");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r3);

        CharacterReader r4 = new CharacterReader("'");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r5);

        CharacterReader r6 = new CharacterReader("a");
        TokeniserState.BetweenDoctypePublicAndSystemIdentifiers.read(t, r6);
    }

    @Test
    public void testAfterDoctypeSystemKeyword_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AfterDoctypeSystemKeyword);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.AfterDoctypeSystemKeyword.read(t, r1);

        CharacterReader r2 = new CharacterReader(">");
        TokeniserState.AfterDoctypeSystemKeyword.read(t, r2);

        CharacterReader r3 = new CharacterReader("\"");
        TokeniserState.AfterDoctypeSystemKeyword.read(t, r3);

        CharacterReader r4 = new CharacterReader("'");
        TokeniserState.AfterDoctypeSystemKeyword.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.AfterDoctypeSystemKeyword.read(t, r5);

        CharacterReader r6 = new CharacterReader("a");
        TokeniserState.AfterDoctypeSystemKeyword.read(t, r6);
    }

    @Test
    public void testBeforeDoctypeSystemIdentifier_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.BeforeDoctypeSystemIdentifier);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(t, r1);

        CharacterReader r2 = new CharacterReader("\"");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(t, r2);

        CharacterReader r3 = new CharacterReader("'");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(t, r3);

        CharacterReader r4 = new CharacterReader(">");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(t, r4);

        CharacterReader r5 = new CharacterReader("");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(t, r5);

        CharacterReader r6 = new CharacterReader("a");
        TokeniserState.BeforeDoctypeSystemIdentifier.read(t, r6);
    }

    @Test
    public void testDoctypeSystemIdentifier_doubleQuoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.DoctypeSystemIdentifier_doubleQuoted);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader("\"");
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("a");
        TokeniserState.DoctypeSystemIdentifier_doubleQuoted.read(t, r5);
    }

    @Test
    public void testDoctypeSystemIdentifier_singleQuoted_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.DoctypeSystemIdentifier_singleQuoted);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader("'");
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(t, r1);

        CharacterReader r2 = new CharacterReader("\u0000");
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(t, r2);

        CharacterReader r3 = new CharacterReader(">");
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(t, r3);

        CharacterReader r4 = new CharacterReader("");
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(t, r4);

        CharacterReader r5 = new CharacterReader("a");
        TokeniserState.DoctypeSystemIdentifier_singleQuoted.read(t, r5);
    }

    @Test
    public void testAfterDoctypeSystemIdentifier_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.AfterDoctypeSystemIdentifier);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(" ");
        TokeniserState.AfterDoctypeSystemIdentifier.read(t, r1);

        CharacterReader r2 = new CharacterReader(">");
        TokeniserState.AfterDoctypeSystemIdentifier.read(t, r2);

        CharacterReader r3 = new CharacterReader("");
        TokeniserState.AfterDoctypeSystemIdentifier.read(t, r3);

        CharacterReader r4 = new CharacterReader("a");
        TokeniserState.AfterDoctypeSystemIdentifier.read(t, r4);
    }

    @Test
    public void testBogusDoctype_branches() {
        Tokeniser t = createTokeniser("", TokeniserState.BogusDoctype);
        t.createDoctypePending();

        CharacterReader r1 = new CharacterReader(">");
        TokeniserState.BogusDoctype.read(t, r1);

        CharacterReader r2 = new CharacterReader("");
        TokeniserState.BogusDoctype.read(t, r2);

        CharacterReader r3 = new CharacterReader("abc");
        TokeniserState.BogusDoctype.read(t, r3);
    }

    @Test
    public void testCdataSection_reading() {
        Tokeniser t = createTokeniser("some cdata data]]>after", TokeniserState.CdataSection);
        CharacterReader r = new CharacterReader("some cdata data]]>after");
        TokeniserState.CdataSection.read(t, r);
        Assert.assertEquals(TokeniserState.Data, t.getState());
    }

    @Test
    public void testFullTokenizationScenarios() {
        List<Token> t1 = tokenizeAll("<script><!-- <script> var a = 1; </script> --> </script>", TokeniserState.Data);
        Assert.assertFalse(t1.isEmpty());

        List<Token> t2 = tokenizeAll("<!DOCTYPE html SYSTEM 'about:legacy-compat'><html><head><title>Test &amp;</title></head><body class=\"test\" checked attr='single' unquoted=val><p>Hello</p><!-- a comment --></body></html>", TokeniserState.Data);
        Assert.assertFalse(t2.isEmpty());
    }
}

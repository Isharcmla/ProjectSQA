package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class TokenStreamTest {

    @Test
    public void testConstructor() {
        TokenStream stream = new TokenStream();
        assertNotNull(stream);
    }

    @Test
    public void testIsKeyword_length2() {
        assertTrue(TokenStream.isKeyword("if"));
        assertFalse(TokenStream.isKeyword("af"));
        assertTrue(TokenStream.isKeyword("in"));
        assertFalse(TokenStream.isKeyword("an"));
        assertTrue(TokenStream.isKeyword("do"));
        assertFalse(TokenStream.isKeyword("to"));
        assertFalse(TokenStream.isKeyword("xx"));
    }

    @Test
    public void testIsKeyword_length3() {
        assertTrue(TokenStream.isKeyword("for"));
        assertFalse(TokenStream.isKeyword("far"));
        assertFalse(TokenStream.isKeyword("fox"));

        assertTrue(TokenStream.isKeyword("int"));
        assertFalse(TokenStream.isKeyword("inn"));
        assertFalse(TokenStream.isKeyword("iat"));

        assertTrue(TokenStream.isKeyword("new"));
        assertFalse(TokenStream.isKeyword("now"));
        assertFalse(TokenStream.isKeyword("net"));

        assertTrue(TokenStream.isKeyword("try"));
        assertFalse(TokenStream.isKeyword("toy"));
        assertFalse(TokenStream.isKeyword("trx"));

        assertTrue(TokenStream.isKeyword("var"));
        assertFalse(TokenStream.isKeyword("vor"));
        assertFalse(TokenStream.isKeyword("vax"));

        assertFalse(TokenStream.isKeyword("abc"));
    }

    @Test
    public void testIsKeyword_length4() {
        assertTrue(TokenStream.isKeyword("byte"));
        assertFalse(TokenStream.isKeyword("ball"));

        assertTrue(TokenStream.isKeyword("case"));
        assertFalse(TokenStream.isKeyword("cose"));
        assertFalse(TokenStream.isKeyword("care"));

        assertTrue(TokenStream.isKeyword("char"));
        assertFalse(TokenStream.isKeyword("chir"));
        assertFalse(TokenStream.isKeyword("chat"));
        assertFalse(TokenStream.isKeyword("corn"));

        assertTrue(TokenStream.isKeyword("else"));
        assertFalse(TokenStream.isKeyword("ease"));
        assertFalse(TokenStream.isKeyword("elle"));

        assertTrue(TokenStream.isKeyword("enum"));
        assertFalse(TokenStream.isKeyword("eram"));
        assertFalse(TokenStream.isKeyword("enam"));
        assertFalse(TokenStream.isKeyword("exam"));

        assertTrue(TokenStream.isKeyword("goto"));
        assertFalse(TokenStream.isKeyword("good"));

        assertTrue(TokenStream.isKeyword("long"));
        assertFalse(TokenStream.isKeyword("lane"));

        assertTrue(TokenStream.isKeyword("null"));
        assertFalse(TokenStream.isKeyword("node"));

        assertTrue(TokenStream.isKeyword("true"));
        assertFalse(TokenStream.isKeyword("tree"));
        assertFalse(TokenStream.isKeyword("tour"));

        assertTrue(TokenStream.isKeyword("this"));
        assertFalse(TokenStream.isKeyword("thus"));
        assertFalse(TokenStream.isKeyword("than"));
        assertFalse(TokenStream.isKeyword("that"));

        assertTrue(TokenStream.isKeyword("void"));
        assertFalse(TokenStream.isKeyword("vote"));

        assertTrue(TokenStream.isKeyword("with"));
        assertFalse(TokenStream.isKeyword("word"));

        assertFalse(TokenStream.isKeyword("xxxx"));
    }

    @Test
    public void testIsKeyword_length5() {
        assertTrue(TokenStream.isKeyword("class"));
        assertFalse(TokenStream.isKeyword("clasp"));

        assertTrue(TokenStream.isKeyword("break"));
        assertFalse(TokenStream.isKeyword("bread"));

        assertTrue(TokenStream.isKeyword("while"));
        assertFalse(TokenStream.isKeyword("white"));

        assertTrue(TokenStream.isKeyword("false"));
        assertFalse(TokenStream.isKeyword("falls"));

        assertTrue(TokenStream.isKeyword("const"));
        assertFalse(TokenStream.isKeyword("count"));

        assertTrue(TokenStream.isKeyword("final"));
        assertFalse(TokenStream.isKeyword("finer"));
        assertFalse(TokenStream.isKeyword("panel"));

        assertTrue(TokenStream.isKeyword("float"));
        assertFalse(TokenStream.isKeyword("flock"));

        assertTrue(TokenStream.isKeyword("short"));
        assertFalse(TokenStream.isKeyword("shore"));
        assertFalse(TokenStream.isKeyword("brook"));

        assertTrue(TokenStream.isKeyword("super"));
        assertFalse(TokenStream.isKeyword("space"));

        assertTrue(TokenStream.isKeyword("throw"));
        assertFalse(TokenStream.isKeyword("three"));

        assertTrue(TokenStream.isKeyword("catch"));
        assertFalse(TokenStream.isKeyword("cater"));

        assertFalse(TokenStream.isKeyword("apple"));
    }

    @Test
    public void testIsKeyword_length6() {
        assertTrue(TokenStream.isKeyword("native"));
        assertFalse(TokenStream.isKeyword("nature"));

        assertTrue(TokenStream.isKeyword("delete"));
        assertFalse(TokenStream.isKeyword("delays"));

        assertTrue(TokenStream.isKeyword("return"));
        assertFalse(TokenStream.isKeyword("retire"));
        assertFalse(TokenStream.isKeyword("better"));

        assertTrue(TokenStream.isKeyword("throws"));
        assertFalse(TokenStream.isKeyword("threat"));

        assertTrue(TokenStream.isKeyword("import"));
        assertFalse(TokenStream.isKeyword("impose"));

        assertTrue(TokenStream.isKeyword("double"));
        assertFalse(TokenStream.isKeyword("domain"));

        assertTrue(TokenStream.isKeyword("static"));
        assertFalse(TokenStream.isKeyword("status"));

        assertTrue(TokenStream.isKeyword("public"));
        assertFalse(TokenStream.isKeyword("puddle"));

        assertTrue(TokenStream.isKeyword("switch"));
        assertFalse(TokenStream.isKeyword("swings"));

        assertTrue(TokenStream.isKeyword("export"));
        assertFalse(TokenStream.isKeyword("expert"));

        assertTrue(TokenStream.isKeyword("typeof"));
        assertFalse(TokenStream.isKeyword("tycoon"));

        assertFalse(TokenStream.isKeyword("orange"));
    }

    @Test
    public void testIsKeyword_length7() {
        assertTrue(TokenStream.isKeyword("package"));
        assertFalse(TokenStream.isKeyword("passive"));

        assertTrue(TokenStream.isKeyword("default"));
        assertFalse(TokenStream.isKeyword("defense"));

        assertTrue(TokenStream.isKeyword("finally"));
        assertFalse(TokenStream.isKeyword("finding"));

        assertTrue(TokenStream.isKeyword("boolean"));
        assertFalse(TokenStream.isKeyword("booting"));

        assertTrue(TokenStream.isKeyword("private"));
        assertFalse(TokenStream.isKeyword("primary"));

        assertTrue(TokenStream.isKeyword("extends"));
        assertFalse(TokenStream.isKeyword("extreme"));

        assertFalse(TokenStream.isKeyword("testing"));
    }

    @Test
    public void testIsKeyword_length8() {
        assertTrue(TokenStream.isKeyword("abstract"));
        assertFalse(TokenStream.isKeyword("absolute"));

        assertTrue(TokenStream.isKeyword("continue"));
        assertFalse(TokenStream.isKeyword("constant"));

        assertTrue(TokenStream.isKeyword("debugger"));
        assertFalse(TokenStream.isKeyword("describe"));

        assertTrue(TokenStream.isKeyword("function"));
        assertFalse(TokenStream.isKeyword("fraction"));

        assertTrue(TokenStream.isKeyword("volatile"));
        assertFalse(TokenStream.isKeyword("velocity"));

        assertFalse(TokenStream.isKeyword("standard"));
    }

    @Test
    public void testIsKeyword_length9() {
        assertTrue(TokenStream.isKeyword("interface"));
        assertFalse(TokenStream.isKeyword("interfere"));

        assertTrue(TokenStream.isKeyword("protected"));
        assertFalse(TokenStream.isKeyword("professor"));

        assertTrue(TokenStream.isKeyword("transient"));
        assertFalse(TokenStream.isKeyword("translate"));

        assertFalse(TokenStream.isKeyword("something"));
    }

    @Test
    public void testIsKeyword_length10() {
        assertTrue(TokenStream.isKeyword("implements"));
        assertFalse(TokenStream.isKeyword("imperative"));

        assertTrue(TokenStream.isKeyword("instanceof"));
        assertFalse(TokenStream.isKeyword("instrument"));

        assertFalse(TokenStream.isKeyword("understand"));
    }

    @Test
    public void testIsKeyword_length12() {
        assertTrue(TokenStream.isKeyword("synchronized"));
        assertFalse(TokenStream.isKeyword("synchronizer"));
    }

    @Test
    public void testIsKeyword_otherLengths() {
        assertFalse(TokenStream.isKeyword(""));
        assertFalse(TokenStream.isKeyword("a"));
        assertFalse(TokenStream.isKeyword("elevenchars"));
        assertFalse(TokenStream.isKeyword("thirteenchars"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsKeyword_nullInput_throwsNullPointerException() {
        TokenStream.isKeyword(null);
    }

    @Test
    public void testIsJSIdentifier_validIdentifiers() {
        assertTrue(TokenStream.isJSIdentifier("a"));
        assertTrue(TokenStream.isJSIdentifier("$"));
        assertTrue(TokenStream.isJSIdentifier("_"));
        assertTrue(TokenStream.isJSIdentifier("variable"));
        assertTrue(TokenStream.isJSIdentifier("$var_123"));
    }

    @Test
    public void testIsJSIdentifier_invalidIdentifiers() {
        assertFalse(TokenStream.isJSIdentifier(""));
        assertFalse(TokenStream.isJSIdentifier("1abc"));
        assertFalse(TokenStream.isJSIdentifier("a-b"));
        assertFalse(TokenStream.isJSIdentifier("a+b"));
        assertFalse(TokenStream.isJSIdentifier("a b"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsJSIdentifier_nullInput_throwsNullPointerException() {
        TokenStream.isJSIdentifier(null);
    }
}

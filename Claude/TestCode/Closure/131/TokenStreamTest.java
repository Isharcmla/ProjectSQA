package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenStreamTest {

    // ---------- isKeyword tests ----------

    @Test
    public void testIsKeyword_emptyString_returnsFalse() {
        assertFalse(TokenStream.isKeyword(""));
    }

    @Test
    public void testIsKeyword_length1_returnsFalse() {
        assertFalse(TokenStream.isKeyword("a"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsKeyword_null_throwsNPE() {
        TokenStream.isKeyword(null);
    }

    // length 2 keywords
    @Test
    public void testIsKeyword_if_returnsTrue() {
        assertTrue(TokenStream.isKeyword("if"));
    }

    @Test
    public void testIsKeyword_in_returnsTrue() {
        assertTrue(TokenStream.isKeyword("in"));
    }

    @Test
    public void testIsKeyword_do_returnsTrue() {
        assertTrue(TokenStream.isKeyword("do"));
    }

    @Test
    public void testIsKeyword_length2NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("ab"));
    }

    // length 3 keywords
    @Test
    public void testIsKeyword_for_returnsTrue() {
        assertTrue(TokenStream.isKeyword("for"));
    }

    @Test
    public void testIsKeyword_int_returnsTrue() {
        assertTrue(TokenStream.isKeyword("int"));
    }

    @Test
    public void testIsKeyword_new_returnsTrue() {
        assertTrue(TokenStream.isKeyword("new"));
    }

    @Test
    public void testIsKeyword_try_returnsTrue() {
        assertTrue(TokenStream.isKeyword("try"));
    }

    @Test
    public void testIsKeyword_var_returnsTrue() {
        assertTrue(TokenStream.isKeyword("var"));
    }

    @Test
    public void testIsKeyword_length3NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("xyz"));
    }

    @Test
    public void testIsKeyword_length3FirstCharMatchButRestNoMatch_returnsFalse() {
        assertFalse(TokenStream.isKeyword("fax"));
        assertFalse(TokenStream.isKeyword("ixx"));
        assertFalse(TokenStream.isKeyword("nxx"));
        assertFalse(TokenStream.isKeyword("txx"));
        assertFalse(TokenStream.isKeyword("vxx"));
    }

    // length 4 keywords
    @Test
    public void testIsKeyword_byte_returnsTrue() {
        assertTrue(TokenStream.isKeyword("byte"));
    }

    @Test
    public void testIsKeyword_case_returnsTrue() {
        assertTrue(TokenStream.isKeyword("case"));
    }

    @Test
    public void testIsKeyword_char_returnsTrue() {
        assertTrue(TokenStream.isKeyword("char"));
    }

    @Test
    public void testIsKeyword_else_returnsTrue() {
        assertTrue(TokenStream.isKeyword("else"));
    }

    @Test
    public void testIsKeyword_enum_returnsTrue() {
        assertTrue(TokenStream.isKeyword("enum"));
    }

    @Test
    public void testIsKeyword_goto_returnsTrue() {
        assertTrue(TokenStream.isKeyword("goto"));
    }

    @Test
    public void testIsKeyword_long_returnsTrue() {
        assertTrue(TokenStream.isKeyword("long"));
    }

    @Test
    public void testIsKeyword_null_returnsTrue() {
        assertTrue(TokenStream.isKeyword("null"));
    }

    @Test
    public void testIsKeyword_true_returnsTrue() {
        assertTrue(TokenStream.isKeyword("true"));
    }

    @Test
    public void testIsKeyword_this_returnsTrue() {
        assertTrue(TokenStream.isKeyword("this"));
    }

    @Test
    public void testIsKeyword_void_returnsTrue() {
        assertTrue(TokenStream.isKeyword("void"));
    }

    @Test
    public void testIsKeyword_with_returnsTrue() {
        assertTrue(TokenStream.isKeyword("with"));
    }

    @Test
    public void testIsKeyword_length4NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("byee"));
        assertFalse(TokenStream.isKeyword("caxx"));
        assertFalse(TokenStream.isKeyword("exxx"));
        assertFalse(TokenStream.isKeyword("goxx"));
        assertFalse(TokenStream.isKeyword("loxx"));
        assertFalse(TokenStream.isKeyword("nuxx"));
        assertFalse(TokenStream.isKeyword("txxx"));
        assertFalse(TokenStream.isKeyword("voxx"));
        assertFalse(TokenStream.isKeyword("wixx"));
        assertFalse(TokenStream.isKeyword("zzzz"));
    }

    // length 5 keywords
    @Test
    public void testIsKeyword_class_returnsTrue() {
        assertTrue(TokenStream.isKeyword("class"));
    }

    @Test
    public void testIsKeyword_break_returnsTrue() {
        assertTrue(TokenStream.isKeyword("break"));
    }

    @Test
    public void testIsKeyword_while_returnsTrue() {
        assertTrue(TokenStream.isKeyword("while"));
    }

    @Test
    public void testIsKeyword_false_returnsTrue() {
        assertTrue(TokenStream.isKeyword("false"));
    }

    @Test
    public void testIsKeyword_const_returnsTrue() {
        assertTrue(TokenStream.isKeyword("const"));
    }

    @Test
    public void testIsKeyword_final_returnsTrue() {
        assertTrue(TokenStream.isKeyword("final"));
    }

    @Test
    public void testIsKeyword_float_returnsTrue() {
        assertTrue(TokenStream.isKeyword("float"));
    }

    @Test
    public void testIsKeyword_short_returnsTrue() {
        assertTrue(TokenStream.isKeyword("short"));
    }

    @Test
    public void testIsKeyword_super_returnsTrue() {
        assertTrue(TokenStream.isKeyword("super"));
    }

    @Test
    public void testIsKeyword_throw_returnsTrue() {
        assertTrue(TokenStream.isKeyword("throw"));
    }

    @Test
    public void testIsKeyword_catch_returnsTrue() {
        assertTrue(TokenStream.isKeyword("catch"));
    }

    @Test
    public void testIsKeyword_length5NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("zzzzz"));
        assertFalse(TokenStream.isKeyword("aanxx"));
        assertFalse(TokenStream.isKeyword("aaoxx"));
    }

    // length 6 keywords
    @Test
    public void testIsKeyword_native_returnsTrue() {
        assertTrue(TokenStream.isKeyword("native"));
    }

    @Test
    public void testIsKeyword_delete_returnsTrue() {
        assertTrue(TokenStream.isKeyword("delete"));
    }

    @Test
    public void testIsKeyword_return_returnsTrue() {
        assertTrue(TokenStream.isKeyword("return"));
    }

    @Test
    public void testIsKeyword_throws_returnsTrue() {
        assertTrue(TokenStream.isKeyword("throws"));
    }

    @Test
    public void testIsKeyword_import_returnsTrue() {
        assertTrue(TokenStream.isKeyword("import"));
    }

    @Test
    public void testIsKeyword_double_returnsTrue() {
        assertTrue(TokenStream.isKeyword("double"));
    }

    @Test
    public void testIsKeyword_static_returnsTrue() {
        assertTrue(TokenStream.isKeyword("static"));
    }

    @Test
    public void testIsKeyword_public_returnsTrue() {
        assertTrue(TokenStream.isKeyword("public"));
    }

    @Test
    public void testIsKeyword_switch_returnsTrue() {
        assertTrue(TokenStream.isKeyword("switch"));
    }

    @Test
    public void testIsKeyword_export_returnsTrue() {
        assertTrue(TokenStream.isKeyword("export"));
    }

    @Test
    public void testIsKeyword_typeof_returnsTrue() {
        assertTrue(TokenStream.isKeyword("typeof"));
    }

    @Test
    public void testIsKeyword_length6NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("zzzzzz"));
        assertFalse(TokenStream.isKeyword("azzzzz"));
        assertFalse(TokenStream.isKeyword("rzzzzz"));
    }

    // length 7 keywords
    @Test
    public void testIsKeyword_package_returnsTrue() {
        assertTrue(TokenStream.isKeyword("package"));
    }

    @Test
    public void testIsKeyword_default_returnsTrue() {
        assertTrue(TokenStream.isKeyword("default"));
    }

    @Test
    public void testIsKeyword_finally_returnsTrue() {
        assertTrue(TokenStream.isKeyword("finally"));
    }

    @Test
    public void testIsKeyword_boolean_returnsTrue() {
        assertTrue(TokenStream.isKeyword("boolean"));
    }

    @Test
    public void testIsKeyword_private_returnsTrue() {
        assertTrue(TokenStream.isKeyword("private"));
    }

    @Test
    public void testIsKeyword_extends_returnsTrue() {
        assertTrue(TokenStream.isKeyword("extends"));
    }

    @Test
    public void testIsKeyword_length7NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("zzzzzzz"));
    }

    // length 8 keywords
    @Test
    public void testIsKeyword_abstract_returnsTrue() {
        assertTrue(TokenStream.isKeyword("abstract"));
    }

    @Test
    public void testIsKeyword_continue_returnsTrue() {
        assertTrue(TokenStream.isKeyword("continue"));
    }

    @Test
    public void testIsKeyword_debugger_returnsTrue() {
        assertTrue(TokenStream.isKeyword("debugger"));
    }

    @Test
    public void testIsKeyword_function_returnsTrue() {
        assertTrue(TokenStream.isKeyword("function"));
    }

    @Test
    public void testIsKeyword_volatile_returnsTrue() {
        assertTrue(TokenStream.isKeyword("volatile"));
    }

    @Test
    public void testIsKeyword_length8NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("zzzzzzzz"));
    }

    // length 9 keywords
    @Test
    public void testIsKeyword_interface_returnsTrue() {
        assertTrue(TokenStream.isKeyword("interface"));
    }

    @Test
    public void testIsKeyword_protected_returnsTrue() {
        assertTrue(TokenStream.isKeyword("protected"));
    }

    @Test
    public void testIsKeyword_transient_returnsTrue() {
        assertTrue(TokenStream.isKeyword("transient"));
    }

    @Test
    public void testIsKeyword_length9NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("zzzzzzzzz"));
    }

    // length 10 keywords
    @Test
    public void testIsKeyword_implements_returnsTrue() {
        assertTrue(TokenStream.isKeyword("implements"));
    }

    @Test
    public void testIsKeyword_instanceof_returnsTrue() {
        assertTrue(TokenStream.isKeyword("instanceof"));
    }

    @Test
    public void testIsKeyword_length10NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("zzzzzzzzzz"));
    }

    // length 11 (not handled in switch) -> always false
    @Test
    public void testIsKeyword_length11_returnsFalse() {
        assertFalse(TokenStream.isKeyword("elevenchars"));
    }

    // length 12 keyword
    @Test
    public void testIsKeyword_synchronized_returnsTrue() {
        assertTrue(TokenStream.isKeyword("synchronized"));
    }

    @Test
    public void testIsKeyword_length12NonKeyword_returnsFalse() {
        assertFalse(TokenStream.isKeyword("zzzzzzzzzzzz"));
    }

    // length 13 (not handled) -> false
    @Test
    public void testIsKeyword_length13_returnsFalse() {
        assertFalse(TokenStream.isKeyword("thirteenchars"));
    }

    // ---------- isJSIdentifier tests ----------

    @Test
    public void testIsJSIdentifier_normalIdentifier_returnsTrue() {
        assertTrue(TokenStream.isJSIdentifier("myVar123"));
    }

    @Test
    public void testIsJSIdentifier_singleCharValid_returnsTrue() {
        assertTrue(TokenStream.isJSIdentifier("a"));
    }

    @Test
    public void testIsJSIdentifier_underscoreStart_returnsTrue() {
        assertTrue(TokenStream.isJSIdentifier("_underscore"));
    }

    @Test
    public void testIsJSIdentifier_dollarStart_returnsTrue() {
        assertTrue(TokenStream.isJSIdentifier("$dollar"));
    }

    @Test
    public void testIsJSIdentifier_emptyString_returnsFalse() {
        assertFalse(TokenStream.isJSIdentifier(""));
    }

    @Test
    public void testIsJSIdentifier_startsWithDigit_returnsFalse() {
        assertFalse(TokenStream.isJSIdentifier("1abc"));
    }

    @Test
    public void testIsJSIdentifier_invalidPartChar_returnsFalse() {
        assertFalse(TokenStream.isJSIdentifier("abc-def"));
    }

    @Test
    public void testIsJSIdentifier_invalidStartChar_returnsFalse() {
        assertFalse(TokenStream.isJSIdentifier("-abc"));
    }

    @Test(expected = NullPointerException.class)
    public void testIsJSIdentifier_null_throwsNPE() {
        TokenStream.isJSIdentifier(null);
    }

    @Test
    public void testIsJSIdentifier_digitsAfterFirstChar_returnsTrue() {
        assertTrue(TokenStream.isJSIdentifier("a1b2c3"));
    }
}

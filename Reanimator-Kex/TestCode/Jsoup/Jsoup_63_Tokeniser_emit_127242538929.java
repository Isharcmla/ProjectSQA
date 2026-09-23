package org.jsoup.parser;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class Tokeniser_emit_127242538929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3637;

    public Tokeniser_emit_127242538929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term61543 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term61542 = ((Class) term61543).getDeclaredField((String) "RCDATAEndTagOpen");
        ((Field) term61542).setAccessible(true);
        Object enum172 = ((Field) term61542).get((Object) null);
        Class<? extends Object> term61851 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term61850 = ((Class) term61851).getDeclaredField((String) "StartTag");
        ((Field) term61850).setAccessible(true);
        Object enum173 = ((Field) term61850).get((Object) null);
        LinkedHashMap term3971 = new LinkedHashMap();
        Class<? extends Object> term62098 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term62097 = ((Class) term62098).getDeclaredField((String) "EndTag");
        ((Field) term62097).setAccessible(true);
        Object enum174 = ((Field) term62097).get((Object) null);
        Class<? extends Object> term62293 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term62292 = ((Class) term62293).getDeclaredField((String) "Character");
        ((Field) term62292).setAccessible(true);
        Object enum175 = ((Field) term62292).get((Object) null);
        Class<? extends Object> term62545 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term62544 = ((Class) term62545).getDeclaredField((String) "Doctype");
        ((Field) term62544).setAccessible(true);
        Object enum176 = ((Field) term62544).get((Object) null);
        Class<? extends Object> term62749 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term62748 = ((Class) term62749).getDeclaredField((String) "Comment");
        ((Field) term62748).setAccessible(true);
        Object enum177 = ((Field) term62748).get((Object) null);
        term3637 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term3638 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term3639 = (char[]) newCharArray(6);
        Object[] term3651 = (Object[]) newArray("java.lang.String", 7);
        Object term3736 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term3773 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3774 = (byte[]) newByteArray(16);
        Object term3793 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3794 = (byte[]) newByteArray(16);
        Object term3813 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term3850 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3851 = (byte[]) newByteArray(16);
        Object term3885 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term3898 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term3935 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term3936 = (byte[]) newByteArray(16);
        Object term3970 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term3990 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term4016 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term4017 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4018 = (byte[]) newByteArray(16);
        Object term4049 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4050 = (byte[]) newByteArray(16);
        Object term4069 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4070 = (byte[]) newByteArray(16);
        Object term4101 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term4102 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term4103 = (byte[]) newByteArray(16);
        int[] term4147 = (int[]) newIntArray(6);
        int[] term4154 = (int[]) newIntArray(5);
        setCharElement(term3639, 0, 'T');
        setCharElement(term3639, 1, 'D');
        setCharElement(term3639, 2, 's');
        setCharElement(term3639, 3, 'j');
        setCharElement(term3639, 4, 'l');
        setCharElement(term3639, 5, 'J');
        setField(term3638, term3638.getClass(), "charBuf", term3639);
        setField(term3638, term3638.getClass(), "reader", null);
        setIntField(term3638, term3638.getClass(), "bufLength", -655067527);
        setIntField(term3638, term3638.getClass(), "bufSplitPoint", -6029667);
        setIntField(term3638, term3638.getClass(), "bufPos", -2068769794);
        setIntField(term3638, term3638.getClass(), "readerPos", -117576464);
        setIntField(term3638, term3638.getClass(), "bufMark", -1007160944);
        setElement(term3651, 0, "eZFUvlxvGV");
        setElement(term3651, 1, "BYqFIqCKAV");
        setElement(term3651, 2, "vrQLuWIDJX");
        setElement(term3651, 3, "flxyYxBRtu");
        setElement(term3651, 4, "OclPbYPkcH");
        setElement(term3651, 5, "IoAlmYsBwc");
        setElement(term3651, 6, "TEParAifyi");
        setField(term3638, term3638.getClass(), "stringCache", term3651);
        setField(term3637, term3637.getClass(), "reader", term3638);
        setIntField(term3736, term3736.getClass(), "maxSize", 0);
        setField(term3736, term3736.getClass(), "elementData", null);
        setIntField(term3736, term3736.getClass(), "size", 0);
        setIntField(term3736, term3736.getClass(), "modCount", 0);
        setField(term3637, term3637.getClass(), "errors", term3736);
        setField(term3637, term3637.getClass(), "state", enum172);
        setField(term3637, term3637.getClass(), "emitPending", null);
        setBooleanField(term3637, term3637.getClass(), "isEmitPending", false);
        setField(term3637, term3637.getClass(), "charsString", "OWDIEULEFu");
        setField(term3773, term3773.getClass(), "value", term3774);
        setByteField(term3773, term3773.getClass(), "coder", (byte) 89);
        setIntField(term3773, term3773.getClass(), "count", 1135664017);
        setField(term3637, term3637.getClass(), "charsBuilder", term3773);
        setField(term3793, term3793.getClass(), "value", term3794);
        setByteField(term3793, term3793.getClass(), "coder", (byte) 75);
        setIntField(term3793, term3793.getClass(), "count", 590364439);
        setField(term3637, term3637.getClass(), "dataBuffer", term3793);
        setField(term3637, term3637.getClass(), "tagPending", null);
        setField(term3813, term3813.getClass(), "tagName", "dWRymuLBtr");
        setField(term3813, term3813.getClass(), "normalName", "AijpHYOFuy");
        setField(term3813, term3813.getClass(), "pendingAttributeName", "SbAoxhfrkn");
        setField(term3850, term3850.getClass(), "value", term3851);
        setByteField(term3850, term3850.getClass(), "coder", (byte) 0);
        setIntField(term3850, term3850.getClass(), "count", 0);
        setField(term3813, term3813.getClass(), "pendingAttributeValue", term3850);
        setField(term3813, term3813.getClass(), "pendingAttributeValueS", "kuTXqwMtDB");
        setBooleanField(term3813, term3813.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term3813, term3813.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term3813, term3813.getClass(), "selfClosing", true);
        setField(term3885, term3885.getClass(), "attributes", null);
        setField(term3813, term3813.getClass(), "attributes", term3885);
        setField(term3813, term3813.getClass(), "type", enum173);
        setField(term3637, term3637.getClass(), "startPending", term3813);
        setField(term3898, term3898.getClass(), "tagName", "Ghbwtircqb");
        setField(term3898, term3898.getClass(), "normalName", "xrwlQZdwCp");
        setField(term3898, term3898.getClass(), "pendingAttributeName", "IDCWpPLRkE");
        setField(term3935, term3935.getClass(), "value", term3936);
        setByteField(term3935, term3935.getClass(), "coder", (byte) 0);
        setIntField(term3935, term3935.getClass(), "count", 0);
        setField(term3898, term3898.getClass(), "pendingAttributeValue", term3935);
        setField(term3898, term3898.getClass(), "pendingAttributeValueS", "nyiiPDVjAc");
        setBooleanField(term3898, term3898.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term3898, term3898.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term3898, term3898.getClass(), "selfClosing", true);
        setField(term3970, term3970.getClass(), "attributes", term3971);
        setField(term3898, term3898.getClass(), "attributes", term3970);
        setField(term3898, term3898.getClass(), "type", enum174);
        setField(term3637, term3637.getClass(), "endPending", term3898);
        setField(term3990, term3990.getClass(), "data", "gGSMzuGICf");
        setField(term3990, term3990.getClass(), "type", enum175);
        setField(term3637, term3637.getClass(), "charPending", term3990);
        setField(term4017, term4017.getClass(), "value", term4018);
        setByteField(term4017, term4017.getClass(), "coder", (byte) 0);
        setIntField(term4017, term4017.getClass(), "count", 0);
        setField(term4016, term4016.getClass(), "name", term4017);
        setField(term4016, term4016.getClass(), "pubSysKey", "hxCBltsObl");
        setField(term4049, term4049.getClass(), "value", term4050);
        setByteField(term4049, term4049.getClass(), "coder", (byte) 0);
        setIntField(term4049, term4049.getClass(), "count", 0);
        setField(term4016, term4016.getClass(), "publicIdentifier", term4049);
        setField(term4069, term4069.getClass(), "value", term4070);
        setByteField(term4069, term4069.getClass(), "coder", (byte) 0);
        setIntField(term4069, term4069.getClass(), "count", 0);
        setField(term4016, term4016.getClass(), "systemIdentifier", term4069);
        setBooleanField(term4016, term4016.getClass(), "forceQuirks", true);
        setField(term4016, term4016.getClass(), "type", enum176);
        setField(term3637, term3637.getClass(), "doctypePending", term4016);
        setField(term4102, term4102.getClass(), "value", term4103);
        setByteField(term4102, term4102.getClass(), "coder", (byte) 0);
        setIntField(term4102, term4102.getClass(), "count", 0);
        setField(term4101, term4101.getClass(), "data", term4102);
        setBooleanField(term4101, term4101.getClass(), "bogus", false);
        setField(term4101, term4101.getClass(), "type", enum177);
        setField(term3637, term3637.getClass(), "commentPending", term4101);
        setField(term3637, term3637.getClass(), "lastStartTag", "BndsHwAFMv");
        setBooleanField(term3637, term3637.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term4147, 0, 865208305);
        setIntElement(term4147, 1, -1275173084);
        setIntElement(term4147, 2, -244121226);
        setIntElement(term4147, 3, -203030934);
        setIntElement(term4147, 4, -1179120542);
        setIntElement(term4147, 5, -73683645);
        setField(term3637, term3637.getClass(), "codepointHolder", term4147);
        setIntElement(term4154, 0, -226514366);
        setIntElement(term4154, 1, 1193880199);
        setIntElement(term4154, 2, -1087774327);
        setIntElement(term4154, 3, -1530420153);
        setIntElement(term4154, 4, -469968304);
        setField(term3637, term3637.getClass(), "multipointHolder", term4154);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token");
        Object[] args = new Object[1];
        args[0] = null;
        try {
            callMethod(klass, "emit", argTypes, term3637, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



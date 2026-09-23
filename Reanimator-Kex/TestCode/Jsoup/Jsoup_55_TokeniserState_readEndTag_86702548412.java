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
import java.lang.OutOfMemoryError;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;

public class TokeniserState_readEndTag_86702548412 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8377;
     Object term8823;
     Object enum140;
     Object enum141;

    public TokeniserState_readEndTag_86702548412() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term41108 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term41107 = ((Class) term41108).getDeclaredField((String) "BogusComment");
        ((Field) term41107).setAccessible(true);
        Object enum134 = ((Field) term41107).get((Object) null);
        Class<? extends Object> term41404 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41403 = ((Class) term41404).getDeclaredField((String) "StartTag");
        ((Field) term41403).setAccessible(true);
        Object enum135 = ((Field) term41403).get((Object) null);
        LinkedHashMap term8645 = new LinkedHashMap();
        Class<? extends Object> term41651 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41650 = ((Class) term41651).getDeclaredField((String) "EndTag");
        ((Field) term41650).setAccessible(true);
        Object enum136 = ((Field) term41650).get((Object) null);
        Class<? extends Object> term41846 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term41845 = ((Class) term41846).getDeclaredField((String) "Character");
        ((Field) term41845).setAccessible(true);
        Object enum137 = ((Field) term41845).get((Object) null);
        Class<? extends Object> term42088 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term42087 = ((Class) term42088).getDeclaredField((String) "Doctype");
        ((Field) term42087).setAccessible(true);
        Object enum138 = ((Field) term42087).get((Object) null);
        Class<? extends Object> term42292 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term42291 = ((Class) term42292).getDeclaredField((String) "Comment");
        ((Field) term42291).setAccessible(true);
        Object enum139 = ((Field) term42291).get((Object) null);
        term8377 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term8378 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term8379 = (char[]) newCharArray(6);
        Object[] term8389 = (Object[]) newArray("java.lang.String", 2);
        Object term8414 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term8447 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8448 = (byte[]) newByteArray(16);
        Object term8467 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8468 = (byte[]) newByteArray(16);
        Object term8487 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term8524 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8525 = (byte[]) newByteArray(16);
        Object term8559 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term8572 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term8609 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8610 = (byte[]) newByteArray(16);
        Object term8644 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term8664 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term8690 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term8691 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8692 = (byte[]) newByteArray(16);
        Object term8711 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8712 = (byte[]) newByteArray(16);
        Object term8731 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8732 = (byte[]) newByteArray(16);
        Object term8763 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term8764 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8765 = (byte[]) newByteArray(16);
        int[] term8809 = (int[]) newIntArray(9);
        int[] term8819 = (int[]) newIntArray(3);
        setCharElement(term8379, 0, 'Q');
        setCharElement(term8379, 1, 'H');
        setCharElement(term8379, 2, 'g');
        setCharElement(term8379, 3, 'q');
        setCharElement(term8379, 4, 'z');
        setCharElement(term8379, 5, 'x');
        setField(term8378, term8378.getClass(), "input", term8379);
        setIntField(term8378, term8378.getClass(), "length", -1968847291);
        setIntField(term8378, term8378.getClass(), "pos", 579005622);
        setIntField(term8378, term8378.getClass(), "mark", -14890619);
        setElement(term8389, 0, "nHXjMycHlU");
        setElement(term8389, 1, "ieCtQFdkii");
        setField(term8378, term8378.getClass(), "stringCache", term8389);
        setField(term8377, term8377.getClass(), "reader", term8378);
        setIntField(term8414, term8414.getClass(), "maxSize", 0);
        setField(term8414, term8414.getClass(), "elementData", null);
        setIntField(term8414, term8414.getClass(), "size", 0);
        setIntField(term8414, term8414.getClass(), "modCount", 0);
        setField(term8377, term8377.getClass(), "errors", term8414);
        setField(term8377, term8377.getClass(), "state", enum134);
        setField(term8377, term8377.getClass(), "emitPending", null);
        setBooleanField(term8377, term8377.getClass(), "isEmitPending", true);
        setField(term8377, term8377.getClass(), "charsString", "dEnhdmILtU");
        setField(term8447, term8447.getClass(), "value", term8448);
        setByteField(term8447, term8447.getClass(), "coder", (byte) -29);
        setIntField(term8447, term8447.getClass(), "count", 1632125673);
        setField(term8377, term8377.getClass(), "charsBuilder", term8447);
        setField(term8467, term8467.getClass(), "value", term8468);
        setByteField(term8467, term8467.getClass(), "coder", (byte) -54);
        setIntField(term8467, term8467.getClass(), "count", 454281060);
        setField(term8377, term8377.getClass(), "dataBuffer", term8467);
        setField(term8377, term8377.getClass(), "tagPending", null);
        setField(term8487, term8487.getClass(), "tagName", "hoicvmsovO");
        setField(term8487, term8487.getClass(), "normalName", "eqJfYWRaEL");
        setField(term8487, term8487.getClass(), "pendingAttributeName", "fhkbdRViHi");
        setField(term8524, term8524.getClass(), "value", term8525);
        setByteField(term8524, term8524.getClass(), "coder", (byte) 0);
        setIntField(term8524, term8524.getClass(), "count", 0);
        setField(term8487, term8487.getClass(), "pendingAttributeValue", term8524);
        setField(term8487, term8487.getClass(), "pendingAttributeValueS", "uWHnvSvaPl");
        setBooleanField(term8487, term8487.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term8487, term8487.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term8487, term8487.getClass(), "selfClosing", true);
        setField(term8559, term8559.getClass(), "attributes", null);
        setField(term8487, term8487.getClass(), "attributes", term8559);
        setField(term8487, term8487.getClass(), "type", enum135);
        setField(term8377, term8377.getClass(), "startPending", term8487);
        setField(term8572, term8572.getClass(), "tagName", "kBdSllIBVz");
        setField(term8572, term8572.getClass(), "normalName", "TJmVBGfTML");
        setField(term8572, term8572.getClass(), "pendingAttributeName", "tPlsykYBqO");
        setField(term8609, term8609.getClass(), "value", term8610);
        setByteField(term8609, term8609.getClass(), "coder", (byte) 0);
        setIntField(term8609, term8609.getClass(), "count", 0);
        setField(term8572, term8572.getClass(), "pendingAttributeValue", term8609);
        setField(term8572, term8572.getClass(), "pendingAttributeValueS", "bLPjGVBhlX");
        setBooleanField(term8572, term8572.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term8572, term8572.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term8572, term8572.getClass(), "selfClosing", true);
        setField(term8644, term8644.getClass(), "attributes", term8645);
        setField(term8572, term8572.getClass(), "attributes", term8644);
        setField(term8572, term8572.getClass(), "type", enum136);
        setField(term8377, term8377.getClass(), "endPending", term8572);
        setField(term8664, term8664.getClass(), "data", "KoyGrUJeJW");
        setField(term8664, term8664.getClass(), "type", enum137);
        setField(term8377, term8377.getClass(), "charPending", term8664);
        setField(term8691, term8691.getClass(), "value", term8692);
        setByteField(term8691, term8691.getClass(), "coder", (byte) 0);
        setIntField(term8691, term8691.getClass(), "count", 0);
        setField(term8690, term8690.getClass(), "name", term8691);
        setField(term8711, term8711.getClass(), "value", term8712);
        setByteField(term8711, term8711.getClass(), "coder", (byte) 0);
        setIntField(term8711, term8711.getClass(), "count", 0);
        setField(term8690, term8690.getClass(), "publicIdentifier", term8711);
        setField(term8731, term8731.getClass(), "value", term8732);
        setByteField(term8731, term8731.getClass(), "coder", (byte) 0);
        setIntField(term8731, term8731.getClass(), "count", 0);
        setField(term8690, term8690.getClass(), "systemIdentifier", term8731);
        setBooleanField(term8690, term8690.getClass(), "forceQuirks", true);
        setField(term8690, term8690.getClass(), "type", enum138);
        setField(term8377, term8377.getClass(), "doctypePending", term8690);
        setField(term8764, term8764.getClass(), "value", term8765);
        setByteField(term8764, term8764.getClass(), "coder", (byte) 0);
        setIntField(term8764, term8764.getClass(), "count", 0);
        setField(term8763, term8763.getClass(), "data", term8764);
        setBooleanField(term8763, term8763.getClass(), "bogus", true);
        setField(term8763, term8763.getClass(), "type", enum139);
        setField(term8377, term8377.getClass(), "commentPending", term8763);
        setField(term8377, term8377.getClass(), "lastStartTag", "HqBOwkVqjD");
        setBooleanField(term8377, term8377.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term8809, 0, -1786399638);
        setIntElement(term8809, 1, 2055867847);
        setIntElement(term8809, 2, -1048298087);
        setIntElement(term8809, 3, 292681826);
        setIntElement(term8809, 4, 458147407);
        setIntElement(term8809, 5, -184153539);
        setIntElement(term8809, 6, 493620644);
        setIntElement(term8809, 7, 1328271830);
        setIntElement(term8809, 8, 1596070772);
        setField(term8377, term8377.getClass(), "codepointHolder", term8809);
        setIntElement(term8819, 0, 97029295);
        setIntElement(term8819, 1, -1371869594);
        setIntElement(term8819, 2, -2095575670);
        setField(term8377, term8377.getClass(), "multipointHolder", term8819);
        term8823 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term8824 = (char[]) newCharArray(5);
        Object[] term8833 = (Object[]) newArray("java.lang.String", 6);
        setCharElement(term8824, 0, 'x');
        setCharElement(term8824, 1, 't');
        setCharElement(term8824, 2, 'l');
        setCharElement(term8824, 3, 'P');
        setCharElement(term8824, 4, 'w');
        setField(term8823, term8823.getClass(), "input", term8824);
        setIntField(term8823, term8823.getClass(), "length", 1225272962);
        setIntField(term8823, term8823.getClass(), "pos", 1324040357);
        setIntField(term8823, term8823.getClass(), "mark", -1588772968);
        setElement(term8833, 0, "MAcUBcBckh");
        setElement(term8833, 1, "oVgzLbrsFr");
        setElement(term8833, 2, "vQVyKLdtaz");
        setElement(term8833, 3, "OWKQODBLzb");
        setElement(term8833, 4, "wGmYcqUkgE");
        setElement(term8833, 5, "idgaQsnJpQ");
        setField(term8823, term8823.getClass(), "stringCache", term8833);
        Class<? extends Object> term42567 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term42566 = ((Class) term42567).getDeclaredField((String) "AttributeValue_doubleQuoted");
        ((Field) term42566).setAccessible(true);
        enum140 = ((Field) term42566).get((Object) null);
        Class<? extends Object> term42810 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term42809 = ((Class) term42810).getDeclaredField((String) "AfterDoctypePublicIdentifier");
        ((Field) term42809).setAccessible(true);
        enum141 = ((Field) term42809).get((Object) null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.TokeniserState");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.jsoup.parser.Tokeniser");
        argTypes[1] = Class.forName("org.jsoup.parser.CharacterReader");
        argTypes[2] = Class.forName("org.jsoup.parser.TokeniserState");
        argTypes[3] = Class.forName("org.jsoup.parser.TokeniserState");
        Object[] args = new Object[4];
        args[0] = term8377;
        args[1] = term8823;
        args[2] = enum140;
        args[3] = enum141;
        try {
            callMethod(klass, "readEndTag", argTypes, null, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};



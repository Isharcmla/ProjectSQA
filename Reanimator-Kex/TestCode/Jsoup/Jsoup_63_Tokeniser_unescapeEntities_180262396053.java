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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.LinkedHashMap;
import java.lang.Boolean;

public class Tokeniser_unescapeEntities_180262396053 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term51567;
     Object term52081;

    public Tokeniser_unescapeEntities_180262396053() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term132415 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term132414 = ((Class) term132415).getDeclaredField((String) "AttributeValue_doubleQuoted");
        ((Field) term132414).setAccessible(true);
        Object enum416 = ((Field) term132414).get((Object) null);
        Class<? extends Object> term132756 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term132755 = ((Class) term132756).getDeclaredField((String) "StartTag");
        ((Field) term132755).setAccessible(true);
        Object enum417 = ((Field) term132755).get((Object) null);
        LinkedHashMap term51899 = new LinkedHashMap();
        Class<? extends Object> term133003 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term133002 = ((Class) term133003).getDeclaredField((String) "EndTag");
        ((Field) term133002).setAccessible(true);
        Object enum418 = ((Field) term133002).get((Object) null);
        Class<? extends Object> term133198 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term133197 = ((Class) term133198).getDeclaredField((String) "Character");
        ((Field) term133197).setAccessible(true);
        Object enum419 = ((Field) term133197).get((Object) null);
        Class<? extends Object> term133450 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term133449 = ((Class) term133450).getDeclaredField((String) "Doctype");
        ((Field) term133449).setAccessible(true);
        Object enum420 = ((Field) term133449).get((Object) null);
        Class<? extends Object> term133654 = Class.forName((String) "org.jsoup.parser.Token$TokenType");
        Field term133653 = ((Class) term133654).getDeclaredField((String) "Comment");
        ((Field) term133653).setAccessible(true);
        Object enum421 = ((Field) term133653).get((Object) null);
        term51567 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        Object term51568 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term51569 = (char[]) newCharArray(5);
        Object[] term51580 = (Object[]) newArray("java.lang.String", 6);
        Object term51653 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term51701 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term51702 = (byte[]) newByteArray(16);
        Object term51721 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term51722 = (byte[]) newByteArray(16);
        Object term51741 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term51778 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term51779 = (byte[]) newByteArray(16);
        Object term51813 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term51826 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term51863 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term51864 = (byte[]) newByteArray(16);
        Object term51898 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object term51918 = newInstance(Class.forName("org.jsoup.parser.Token$Character"));
        Object term51944 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        Object term51945 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term51946 = (byte[]) newByteArray(16);
        Object term51977 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term51978 = (byte[]) newByteArray(16);
        Object term51997 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term51998 = (byte[]) newByteArray(16);
        Object term52029 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        Object term52030 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term52031 = (byte[]) newByteArray(16);
        int[] term52075 = (int[]) newIntArray(3);
        int[] term52079 = (int[]) newIntArray(1);
        setCharElement(term51569, 0, 'J');
        setCharElement(term51569, 1, 'M');
        setCharElement(term51569, 2, 'x');
        setCharElement(term51569, 3, 'l');
        setCharElement(term51569, 4, 's');
        setField(term51568, term51568.getClass(), "charBuf", term51569);
        setField(term51568, term51568.getClass(), "reader", null);
        setIntField(term51568, term51568.getClass(), "bufLength", 1988605357);
        setIntField(term51568, term51568.getClass(), "bufSplitPoint", 808203320);
        setIntField(term51568, term51568.getClass(), "bufPos", -544382127);
        setIntField(term51568, term51568.getClass(), "readerPos", -1830198043);
        setIntField(term51568, term51568.getClass(), "bufMark", -439048495);
        setElement(term51580, 0, "MqICFYzDJj");
        setElement(term51580, 1, "YgQvdcBQKw");
        setElement(term51580, 2, "FiYYLuailz");
        setElement(term51580, 3, "XebAeSnCKZ");
        setElement(term51580, 4, "GeddnXjHGy");
        setElement(term51580, 5, "vLTbaoAxBm");
        setField(term51568, term51568.getClass(), "stringCache", term51580);
        setField(term51567, term51567.getClass(), "reader", term51568);
        setIntField(term51653, term51653.getClass(), "maxSize", 0);
        setField(term51653, term51653.getClass(), "elementData", null);
        setIntField(term51653, term51653.getClass(), "size", 0);
        setIntField(term51653, term51653.getClass(), "modCount", 0);
        setField(term51567, term51567.getClass(), "errors", term51653);
        setField(term51567, term51567.getClass(), "state", enum416);
        setField(term51567, term51567.getClass(), "emitPending", null);
        setBooleanField(term51567, term51567.getClass(), "isEmitPending", false);
        setField(term51567, term51567.getClass(), "charsString", "BXTjEyEZxD");
        setField(term51701, term51701.getClass(), "value", term51702);
        setByteField(term51701, term51701.getClass(), "coder", (byte) -23);
        setIntField(term51701, term51701.getClass(), "count", -1849105286);
        setField(term51567, term51567.getClass(), "charsBuilder", term51701);
        setField(term51721, term51721.getClass(), "value", term51722);
        setByteField(term51721, term51721.getClass(), "coder", (byte) 100);
        setIntField(term51721, term51721.getClass(), "count", 1334483645);
        setField(term51567, term51567.getClass(), "dataBuffer", term51721);
        setField(term51567, term51567.getClass(), "tagPending", null);
        setField(term51741, term51741.getClass(), "tagName", "oKhVzOKUFW");
        setField(term51741, term51741.getClass(), "normalName", "mNHyqmOAFy");
        setField(term51741, term51741.getClass(), "pendingAttributeName", "UxgSdhxPCH");
        setField(term51778, term51778.getClass(), "value", term51779);
        setByteField(term51778, term51778.getClass(), "coder", (byte) 0);
        setIntField(term51778, term51778.getClass(), "count", 0);
        setField(term51741, term51741.getClass(), "pendingAttributeValue", term51778);
        setField(term51741, term51741.getClass(), "pendingAttributeValueS", "DAujxZPHJC");
        setBooleanField(term51741, term51741.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term51741, term51741.getClass(), "hasPendingAttributeValue", true);
        setBooleanField(term51741, term51741.getClass(), "selfClosing", true);
        setField(term51813, term51813.getClass(), "attributes", null);
        setField(term51741, term51741.getClass(), "attributes", term51813);
        setField(term51741, term51741.getClass(), "type", enum417);
        setField(term51567, term51567.getClass(), "startPending", term51741);
        setField(term51826, term51826.getClass(), "tagName", "IlBhdrCvHq");
        setField(term51826, term51826.getClass(), "normalName", "OirVUQhauU");
        setField(term51826, term51826.getClass(), "pendingAttributeName", "GLbyDfbNZI");
        setField(term51863, term51863.getClass(), "value", term51864);
        setByteField(term51863, term51863.getClass(), "coder", (byte) 0);
        setIntField(term51863, term51863.getClass(), "count", 0);
        setField(term51826, term51826.getClass(), "pendingAttributeValue", term51863);
        setField(term51826, term51826.getClass(), "pendingAttributeValueS", "oNLcCYDAsO");
        setBooleanField(term51826, term51826.getClass(), "hasEmptyAttributeValue", true);
        setBooleanField(term51826, term51826.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term51826, term51826.getClass(), "selfClosing", true);
        setField(term51898, term51898.getClass(), "attributes", term51899);
        setField(term51826, term51826.getClass(), "attributes", term51898);
        setField(term51826, term51826.getClass(), "type", enum418);
        setField(term51567, term51567.getClass(), "endPending", term51826);
        setField(term51918, term51918.getClass(), "data", "GbahCBMvct");
        setField(term51918, term51918.getClass(), "type", enum419);
        setField(term51567, term51567.getClass(), "charPending", term51918);
        setField(term51945, term51945.getClass(), "value", term51946);
        setByteField(term51945, term51945.getClass(), "coder", (byte) 0);
        setIntField(term51945, term51945.getClass(), "count", 0);
        setField(term51944, term51944.getClass(), "name", term51945);
        setField(term51944, term51944.getClass(), "pubSysKey", "iiHBhsNFgk");
        setField(term51977, term51977.getClass(), "value", term51978);
        setByteField(term51977, term51977.getClass(), "coder", (byte) 0);
        setIntField(term51977, term51977.getClass(), "count", 0);
        setField(term51944, term51944.getClass(), "publicIdentifier", term51977);
        setField(term51997, term51997.getClass(), "value", term51998);
        setByteField(term51997, term51997.getClass(), "coder", (byte) 0);
        setIntField(term51997, term51997.getClass(), "count", 0);
        setField(term51944, term51944.getClass(), "systemIdentifier", term51997);
        setBooleanField(term51944, term51944.getClass(), "forceQuirks", false);
        setField(term51944, term51944.getClass(), "type", enum420);
        setField(term51567, term51567.getClass(), "doctypePending", term51944);
        setField(term52030, term52030.getClass(), "value", term52031);
        setByteField(term52030, term52030.getClass(), "coder", (byte) 0);
        setIntField(term52030, term52030.getClass(), "count", 0);
        setField(term52029, term52029.getClass(), "data", term52030);
        setBooleanField(term52029, term52029.getClass(), "bogus", true);
        setField(term52029, term52029.getClass(), "type", enum421);
        setField(term51567, term51567.getClass(), "commentPending", term52029);
        setField(term51567, term51567.getClass(), "lastStartTag", "HknsTajwxJ");
        setBooleanField(term51567, term51567.getClass(), "selfClosingFlagAcknowledged", false);
        setIntElement(term52075, 0, 917513193);
        setIntElement(term52075, 1, 787278105);
        setIntElement(term52075, 2, -2063843486);
        setField(term51567, term51567.getClass(), "codepointHolder", term52075);
        setIntElement(term52079, 0, 833762980);
        setField(term51567, term51567.getClass(), "multipointHolder", term52079);
        term52081 = new Boolean(false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Tokeniser");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = boolean.class;
        Object[] args = new Object[1];
        args[0] = term52081;
        try {
            callMethod(klass, "unescapeEntities", argTypes, term51567, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};



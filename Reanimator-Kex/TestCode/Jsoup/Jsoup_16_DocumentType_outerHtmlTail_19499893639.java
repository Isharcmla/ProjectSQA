package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class DocumentType_outerHtmlTail_19499893639 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8090;
     Object term8120;
     Object term8140;
     Object term8142;
     Object term10297;
     Object term10304;
     Object term10306;

    public DocumentType_outerHtmlTail_19499893639() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8091 = new ArrayList();
        ((ArrayList) term8091).add((Object)null);
        ((ArrayList) term8091).add((Object)null);
        ((ArrayList) term8091).add((Object)null);
        ((ArrayList) term8091).add((Object)null);
        LinkedHashMap term8096 = new LinkedHashMap();
        term8090 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term8095 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8090, term8090.getClass(), "parentNode", null);
        setField(term8090, term8090.getClass(), "childNodes", term8091);
        setField(term8095, term8095.getClass(), "attributes", term8096);
        setField(term8090, term8090.getClass(), "attributes", term8095);
        setField(term8090, term8090.getClass(), "baseUri", "aJlieCFVtF");
        setIntField(term8090, term8090.getClass(), "siblingIndex", -1922583790);
        term8120 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8121 = (byte[]) newByteArray(16);
        setField(term8120, term8120.getClass(), "value", term8121);
        setByteField(term8120, term8120.getClass(), "coder", (byte) 48);
        setIntField(term8120, term8120.getClass(), "count", -616727354);
        term8140 = new Integer(-1955890973);
        Class<? extends Object> term10360 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term10359 = ((Class) term10360).getDeclaredField((String) "base");
        ((Field) term10359).setAccessible(true);
        Object enum3 = ((Field) term10359).get((Object) null);
        term8142 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term8557 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term8565 = (Object[]) newArray("java.lang.String", 2);
        Object term8591 = newInstance(Class.forName("sun.nio.cs.UTF_8$Encoder"));
        byte[] term8594 = (byte[]) newByteArray(1);
        Object term8596 = newInstance(Class.forName("java.nio.charset.CodingErrorAction"));
        setField(term8142, term8142.getClass(), "escapeMode", enum3);
        setField(term8557, term8557.getClass(), "name", "UTF-8");
        setElement(term8565, 0, "UTF8");
        setElement(term8565, 1, "unicode-1-1-utf-8");
        setField(term8557, term8557.getClass(), "aliases", term8565);
        setField(term8557, term8557.getClass(), "aliasSet", null);
        setField(term8142, term8142.getClass(), "charset", term8557);
        setField(term8591, term8591.getClass(), "sgp", null);
        setField(term8591, term8591.getClass(), "charset", term8557);
        setFloatField(term8591, term8591.getClass(), "averageBytesPerChar", 1.1F);
        setFloatField(term8591, term8591.getClass(), "maxBytesPerChar", 3.0F);
        setByteElement(term8594, 0, (byte) 63);
        setField(term8591, term8591.getClass(), "replacement", term8594);
        setField(term8596, term8596.getClass(), "name", "REPORT");
        setField(term8591, term8591.getClass(), "malformedInputAction", term8596);
        setField(term8591, term8591.getClass(), "unmappableCharacterAction", term8596);
        setIntField(term8591, term8591.getClass(), "state", 0);
        setField(term8591, term8591.getClass(), "cachedDecoder", null);
        setField(term8142, term8142.getClass(), "charsetEncoder", term8591);
        setBooleanField(term8142, term8142.getClass(), "prettyPrint", true);
        setIntField(term8142, term8142.getClass(), "indentAmount", 1);
        ArrayList term10298 = new ArrayList();
        ((ArrayList) term10298).add((Object)null);
        ((ArrayList) term10298).add((Object)null);
        ((ArrayList) term10298).add((Object)null);
        ((ArrayList) term10298).add((Object)null);
        LinkedHashMap term10301 = new LinkedHashMap();
        term10297 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term10300 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term10297, term10297.getClass(), "parentNode", null);
        setField(term10297, term10297.getClass(), "childNodes", term10298);
        setField(term10300, term10300.getClass(), "attributes", term10301);
        setField(term10297, term10297.getClass(), "attributes", term10300);
        setField(term10297, term10297.getClass(), "baseUri", "aJlieCFVtF");
        setIntField(term10297, term10297.getClass(), "siblingIndex", -1922583790);
        term10304 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term10305 = (byte[]) newByteArray(16);
        setField(term10304, term10304.getClass(), "value", term10305);
        setByteField(term10304, term10304.getClass(), "coder", (byte) 48);
        setIntField(term10304, term10304.getClass(), "count", -616727354);
        Class<? extends Object> term10613 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term10612 = ((Class) term10613).getDeclaredField((String) "xhtml");
        ((Field) term10612).setAccessible(true);
        Object enum4 = ((Field) term10612).get((Object) null);
        term10306 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term10320 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term10323 = (Object[]) newArray("java.lang.String", 2);
        Object term10328 = newInstance(Class.forName("sun.nio.cs.UTF_8$Encoder"));
        byte[] term10329 = (byte[]) newByteArray(1);
        Object term10330 = newInstance(Class.forName("java.nio.charset.CodingErrorAction"));
        setField(term10306, term10306.getClass(), "escapeMode", enum4);
        setField(term10320, term10320.getClass(), "name", "UTF-8");
        setElement(term10323, 0, "UTF8");
        setElement(term10323, 1, "unicode-1-1-utf-8");
        setField(term10320, term10320.getClass(), "aliases", term10323);
        setField(term10320, term10320.getClass(), "aliasSet", null);
        setField(term10306, term10306.getClass(), "charset", term10320);
        setField(term10328, term10328.getClass(), "sgp", null);
        setField(term10328, term10328.getClass(), "charset", term10320);
        setFloatField(term10328, term10328.getClass(), "averageBytesPerChar", 1.1F);
        setFloatField(term10328, term10328.getClass(), "maxBytesPerChar", 3.0F);
        setByteElement(term10329, 0, (byte) 63);
        setField(term10328, term10328.getClass(), "replacement", term10329);
        setField(term10330, term10330.getClass(), "name", "REPORT");
        setField(term10328, term10328.getClass(), "malformedInputAction", term10330);
        setField(term10328, term10328.getClass(), "unmappableCharacterAction", term10330);
        setIntField(term10328, term10328.getClass(), "state", 0);
        setField(term10328, term10328.getClass(), "cachedDecoder", null);
        setField(term10306, term10306.getClass(), "charsetEncoder", term10328);
        setBooleanField(term10306, term10306.getClass(), "prettyPrint", true);
        setIntField(term10306, term10306.getClass(), "indentAmount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term8120;
        args[1] = term8140;
        args[2] = term8142;
        callMethod(klass, "outerHtmlTail", argTypes, term8090, args);
        assertTrue(recursiveEquals(term8090, term10297));
        assertTrue(recursiveEquals(term8120, term10304));
        assertTrue(recursiveEquals(term8140, -1955890973));
        assertTrue(recursiveEquals(term8142, term10306));
    }

};



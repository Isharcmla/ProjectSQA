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
import java.lang.OutOfMemoryError;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class DocumentType_outerHtmlHead_16098876198 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term129;
     Object term159;
     Object term179;
     Object term181;

    public DocumentType_outerHtmlHead_16098876198() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term130 = new ArrayList();
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        ((ArrayList) term130).add((Object)null);
        LinkedHashMap term135 = new LinkedHashMap();
        term129 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term134 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term129, term129.getClass(), "parentNode", null);
        setField(term129, term129.getClass(), "childNodes", term130);
        setField(term134, term134.getClass(), "attributes", term135);
        setField(term129, term129.getClass(), "attributes", term134);
        setField(term129, term129.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term129, term129.getClass(), "siblingIndex", 1162663216);
        term159 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term160 = (byte[]) newByteArray(16);
        setField(term159, term159.getClass(), "value", term160);
        setByteField(term159, term159.getClass(), "coder", (byte) 47);
        setIntField(term159, term159.getClass(), "count", 1484323161);
        term179 = new Integer(391863371);
        Class<? extends Object> term9942 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term9941 = ((Class) term9942).getDeclaredField((String) "base");
        ((Field) term9941).setAccessible(true);
        Object enum2 = ((Field) term9941).get((Object) null);
        term181 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term596 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term604 = (Object[]) newArray("java.lang.String", 2);
        Object term630 = newInstance(Class.forName("sun.nio.cs.UTF_8$Encoder"));
        byte[] term633 = (byte[]) newByteArray(1);
        Object term635 = newInstance(Class.forName("java.nio.charset.CodingErrorAction"));
        setField(term181, term181.getClass(), "escapeMode", enum2);
        setField(term596, term596.getClass(), "name", "UTF-8");
        setElement(term604, 0, "UTF8");
        setElement(term604, 1, "unicode-1-1-utf-8");
        setField(term596, term596.getClass(), "aliases", term604);
        setField(term596, term596.getClass(), "aliasSet", null);
        setField(term181, term181.getClass(), "charset", term596);
        setField(term630, term630.getClass(), "sgp", null);
        setField(term630, term630.getClass(), "charset", term596);
        setFloatField(term630, term630.getClass(), "averageBytesPerChar", 1.1F);
        setFloatField(term630, term630.getClass(), "maxBytesPerChar", 3.0F);
        setByteElement(term633, 0, (byte) 63);
        setField(term630, term630.getClass(), "replacement", term633);
        setField(term635, term635.getClass(), "name", "REPORT");
        setField(term630, term630.getClass(), "malformedInputAction", term635);
        setField(term630, term630.getClass(), "unmappableCharacterAction", term635);
        setIntField(term630, term630.getClass(), "state", 0);
        setField(term630, term630.getClass(), "cachedDecoder", null);
        setField(term181, term181.getClass(), "charsetEncoder", term630);
        setBooleanField(term181, term181.getClass(), "prettyPrint", true);
        setIntField(term181, term181.getClass(), "indentAmount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term159;
        args[1] = term179;
        args[2] = term181;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term129, args);
            assertTrue(false);
        }
        catch (OutOfMemoryError e) {
        }

    }

};



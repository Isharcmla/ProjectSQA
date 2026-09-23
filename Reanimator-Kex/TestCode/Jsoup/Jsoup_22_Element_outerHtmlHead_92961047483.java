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
import java.lang.Object;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;
import java.lang.String;

public class Element_outerHtmlHead_92961047483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8288;
     Object term8351;
     Object term8371;
     Object term8373;

    public Element_outerHtmlHead_92961047483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8310 = new HashMap();
        Set<Object> term8849 =  ((Map) term8310).keySet();
        HashSet term8309 = new HashSet((Collection<? extends Object>) term8849);
        ArrayList term8322 = new ArrayList();
        ((ArrayList) term8322).add((Object)null);
        ((ArrayList) term8322).add((Object)null);
        ((ArrayList) term8322).add((Object)null);
        ((ArrayList) term8322).add((Object)null);
        ((ArrayList) term8322).add((Object)null);
        ((ArrayList) term8322).add((Object)null);
        ((ArrayList) term8322).add((Object)null);
        ((ArrayList) term8322).add((Object)null);
        LinkedHashMap term8327 = new LinkedHashMap();
        term8288 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8289 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8326 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8289, term8289.getClass(), "tagName", "kucsxnvbES");
        setBooleanField(term8289, term8289.getClass(), "isBlock", true);
        setBooleanField(term8289, term8289.getClass(), "formatAsBlock", false);
        setBooleanField(term8289, term8289.getClass(), "canContainBlock", true);
        setBooleanField(term8289, term8289.getClass(), "canContainInline", false);
        setBooleanField(term8289, term8289.getClass(), "empty", true);
        setBooleanField(term8289, term8289.getClass(), "selfClosing", true);
        setBooleanField(term8289, term8289.getClass(), "preserveWhitespace", false);
        setField(term8288, term8288.getClass(), "tag", term8289);
        setField(term8288, term8288.getClass(), "classNames", term8309);
        setField(term8288, term8288.getClass(), "parentNode", null);
        setField(term8288, term8288.getClass(), "childNodes", term8322);
        setField(term8326, term8326.getClass(), "attributes", term8327);
        setField(term8288, term8288.getClass(), "attributes", term8326);
        setField(term8288, term8288.getClass(), "baseUri", "jlcBpLoWfd");
        setIntField(term8288, term8288.getClass(), "siblingIndex", -1885090354);
        term8351 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8352 = (byte[]) newByteArray(16);
        setField(term8351, term8351.getClass(), "value", term8352);
        setByteField(term8351, term8351.getClass(), "coder", (byte) 18);
        setIntField(term8351, term8351.getClass(), "count", -2066804303);
        term8371 = new Integer(-1731761810);
        Class<? extends Object> term16064 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term16063 = ((Class) term16064).getDeclaredField((String) "xhtml");
        ((Field) term16063).setAccessible(true);
        Object enum0 = ((Field) term16063).get((Object) null);
        term8373 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term8788 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term8796 = (Object[]) newArray("java.lang.String", 2);
        Object term8822 = newInstance(Class.forName("sun.nio.cs.UTF_8$Encoder"));
        byte[] term8825 = (byte[]) newByteArray(1);
        Object term8827 = newInstance(Class.forName("java.nio.charset.CodingErrorAction"));
        setField(term8373, term8373.getClass(), "escapeMode", enum0);
        setField(term8788, term8788.getClass(), "name", "UTF-8");
        setElement(term8796, 0, "UTF8");
        setElement(term8796, 1, "unicode-1-1-utf-8");
        setField(term8788, term8788.getClass(), "aliases", term8796);
        setField(term8788, term8788.getClass(), "aliasSet", null);
        setField(term8373, term8373.getClass(), "charset", term8788);
        setField(term8822, term8822.getClass(), "sgp", null);
        setField(term8822, term8822.getClass(), "charset", term8788);
        setFloatField(term8822, term8822.getClass(), "averageBytesPerChar", 1.1F);
        setFloatField(term8822, term8822.getClass(), "maxBytesPerChar", 3.0F);
        setByteElement(term8825, 0, (byte) 63);
        setField(term8822, term8822.getClass(), "replacement", term8825);
        setField(term8827, term8827.getClass(), "name", "REPORT");
        setField(term8822, term8822.getClass(), "malformedInputAction", term8827);
        setField(term8822, term8822.getClass(), "unmappableCharacterAction", term8827);
        setIntField(term8822, term8822.getClass(), "state", 0);
        setField(term8822, term8822.getClass(), "cachedDecoder", null);
        setField(term8373, term8373.getClass(), "charsetEncoder", term8822);
        setBooleanField(term8373, term8373.getClass(), "prettyPrint", true);
        setIntField(term8373, term8373.getClass(), "indentAmount", 1);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term8351;
        args[1] = term8371;
        args[2] = term8373;
        callMethod(klass, "outerHtmlHead", argTypes, term8288, args);
    }

};



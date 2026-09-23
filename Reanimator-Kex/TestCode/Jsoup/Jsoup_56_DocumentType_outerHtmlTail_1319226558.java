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

public class DocumentType_outerHtmlTail_1319226558 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term447;
     Object term477;
     Object term479;
     Object term2179;
     Object term2186;

    public DocumentType_outerHtmlTail_1319226558() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term448 = new ArrayList();
        ((ArrayList) term448).add((Object)null);
        ((ArrayList) term448).add((Object)null);
        ((ArrayList) term448).add((Object)null);
        LinkedHashMap term453 = new LinkedHashMap();
        term447 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term452 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term447, term447.getClass(), "parentNode", null);
        setField(term447, term447.getClass(), "childNodes", term448);
        setField(term452, term452.getClass(), "attributes", term453);
        setField(term447, term447.getClass(), "attributes", term452);
        setField(term447, term447.getClass(), "baseUri", "aJlieCFVtF");
        setIntField(term447, term447.getClass(), "siblingIndex", -1922583790);
        term477 = new Integer(-616727354);
        Class<? extends Object> term2201 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2200 = ((Class) term2201).getDeclaredField((String) "html");
        ((Field) term2200).setAccessible(true);
        Object enum4 = ((Field) term2200).get((Object) null);
        term479 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term479, term479.getClass(), "escapeMode", null);
        setField(term479, term479.getClass(), "charset", null);
        setBooleanField(term479, term479.getClass(), "prettyPrint", false);
        setBooleanField(term479, term479.getClass(), "outline", false);
        setIntField(term479, term479.getClass(), "indentAmount", -1955890973);
        setField(term479, term479.getClass(), "syntax", enum4);
        ArrayList term2180 = new ArrayList();
        ((ArrayList) term2180).add((Object)null);
        ((ArrayList) term2180).add((Object)null);
        ((ArrayList) term2180).add((Object)null);
        LinkedHashMap term2183 = new LinkedHashMap();
        term2179 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term2182 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term2179, term2179.getClass(), "parentNode", null);
        setField(term2179, term2179.getClass(), "childNodes", term2180);
        setField(term2182, term2182.getClass(), "attributes", term2183);
        setField(term2179, term2179.getClass(), "attributes", term2182);
        setField(term2179, term2179.getClass(), "baseUri", "aJlieCFVtF");
        setIntField(term2179, term2179.getClass(), "siblingIndex", -1922583790);
        Class<? extends Object> term2460 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2459 = ((Class) term2460).getDeclaredField((String) "html");
        ((Field) term2459).setAccessible(true);
        Object enum5 = ((Field) term2459).get((Object) null);
        term2186 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term2186, term2186.getClass(), "escapeMode", null);
        setField(term2186, term2186.getClass(), "charset", null);
        setBooleanField(term2186, term2186.getClass(), "prettyPrint", false);
        setBooleanField(term2186, term2186.getClass(), "outline", false);
        setIntField(term2186, term2186.getClass(), "indentAmount", -1955890973);
        setField(term2186, term2186.getClass(), "syntax", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term477;
        args[2] = term479;
        callMethod(klass, "outerHtmlTail", argTypes, term447, args);
        assertTrue(recursiveEquals(term447, term2179));
        assertTrue(recursiveEquals(term477, -616727354));
        assertTrue(recursiveEquals(term479, term2186));
    }

};



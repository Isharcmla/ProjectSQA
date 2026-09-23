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

public class DocumentType_outerHtmlTail_19499893637 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term483;
     Object term513;
     Object term533;
     Object term535;
     Object term1850;
     Object term1857;
     Object term1859;

    public DocumentType_outerHtmlTail_19499893637() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term484 = new ArrayList();
        ((ArrayList) term484).add((Object)null);
        ((ArrayList) term484).add((Object)null);
        ((ArrayList) term484).add((Object)null);
        LinkedHashMap term489 = new LinkedHashMap();
        term483 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term488 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term483, term483.getClass(), "parentNode", null);
        setField(term483, term483.getClass(), "childNodes", term484);
        setField(term488, term488.getClass(), "attributes", term489);
        setField(term483, term483.getClass(), "attributes", term488);
        setField(term483, term483.getClass(), "baseUri", "aJlieCFVtF");
        setIntField(term483, term483.getClass(), "siblingIndex", -616727354);
        term513 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term514 = (byte[]) newByteArray(16);
        setField(term513, term513.getClass(), "value", term514);
        setByteField(term513, term513.getClass(), "coder", (byte) 48);
        setIntField(term513, term513.getClass(), "count", -1955890973);
        term533 = new Integer(-2038273078);
        Class<? extends Object> term1890 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term1889 = ((Class) term1890).getDeclaredField((String) "html");
        ((Field) term1889).setAccessible(true);
        Object enum3 = ((Field) term1889).get((Object) null);
        term535 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term535, term535.getClass(), "escapeMode", null);
        setField(term535, term535.getClass(), "charset", null);
        setField(term535, term535.getClass(), "charsetEncoder", null);
        setBooleanField(term535, term535.getClass(), "prettyPrint", false);
        setBooleanField(term535, term535.getClass(), "outline", false);
        setIntField(term535, term535.getClass(), "indentAmount", 1227103734);
        setField(term535, term535.getClass(), "syntax", enum3);
        ArrayList term1851 = new ArrayList();
        ((ArrayList) term1851).add((Object)null);
        ((ArrayList) term1851).add((Object)null);
        ((ArrayList) term1851).add((Object)null);
        LinkedHashMap term1854 = new LinkedHashMap();
        term1850 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term1853 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term1850, term1850.getClass(), "parentNode", null);
        setField(term1850, term1850.getClass(), "childNodes", term1851);
        setField(term1853, term1853.getClass(), "attributes", term1854);
        setField(term1850, term1850.getClass(), "attributes", term1853);
        setField(term1850, term1850.getClass(), "baseUri", "aJlieCFVtF");
        setIntField(term1850, term1850.getClass(), "siblingIndex", -616727354);
        term1857 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term1858 = (byte[]) newByteArray(16);
        setField(term1857, term1857.getClass(), "value", term1858);
        setByteField(term1857, term1857.getClass(), "coder", (byte) 48);
        setIntField(term1857, term1857.getClass(), "count", -1955890973);
        Class<? extends Object> term2165 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term2164 = ((Class) term2165).getDeclaredField((String) "html");
        ((Field) term2164).setAccessible(true);
        Object enum4 = ((Field) term2164).get((Object) null);
        term1859 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term1859, term1859.getClass(), "escapeMode", null);
        setField(term1859, term1859.getClass(), "charset", null);
        setField(term1859, term1859.getClass(), "charsetEncoder", null);
        setBooleanField(term1859, term1859.getClass(), "prettyPrint", false);
        setBooleanField(term1859, term1859.getClass(), "outline", false);
        setIntField(term1859, term1859.getClass(), "indentAmount", 1227103734);
        setField(term1859, term1859.getClass(), "syntax", enum4);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term513;
        args[1] = term533;
        args[2] = term535;
        callMethod(klass, "outerHtmlTail", argTypes, term483, args);
        assertTrue(recursiveEquals(term483, term1850));
        assertTrue(recursiveEquals(term513, term1857));
        assertTrue(recursiveEquals(term533, -2038273078));
        assertTrue(recursiveEquals(term535, term1859));
    }

};



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
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_title_195224324223 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term710;
     Object term8880;

    public Document_title_195224324223() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term8897 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term8896 = ((Class) term8897).getDeclaredField((String) "quirks");
        ((Field) term8896).setAccessible(true);
        Object enum22 = ((Field) term8896).get((Object) null);
        HashMap term745 = new HashMap();
        Set<Object> term9106 =  ((Map) term745).keySet();
        HashSet term744 = new HashSet((Collection<? extends Object>) term9106);
        ArrayList term753 = new ArrayList();
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        ((ArrayList) term753).add((Object)null);
        LinkedHashMap term758 = new LinkedHashMap();
        term710 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term711 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term724 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term757 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term711, term711.getClass(), "escapeMode", null);
        setField(term711, term711.getClass(), "charset", null);
        setField(term711, term711.getClass(), "charsetEncoder", null);
        setBooleanField(term711, term711.getClass(), "prettyPrint", true);
        setIntField(term711, term711.getClass(), "indentAmount", -1922583790);
        setField(term710, term710.getClass(), "outputSettings", term711);
        setField(term710, term710.getClass(), "quirksMode", enum22);
        setField(term724, term724.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term724, term724.getClass(), "isBlock", true);
        setBooleanField(term724, term724.getClass(), "formatAsBlock", false);
        setBooleanField(term724, term724.getClass(), "canContainBlock", false);
        setBooleanField(term724, term724.getClass(), "canContainInline", true);
        setBooleanField(term724, term724.getClass(), "empty", true);
        setBooleanField(term724, term724.getClass(), "selfClosing", true);
        setBooleanField(term724, term724.getClass(), "preserveWhitespace", true);
        setField(term710, term710.getClass(), "tag", term724);
        setField(term710, term710.getClass(), "classNames", term744);
        setField(term710, term710.getClass(), "parentNode", null);
        setField(term710, term710.getClass(), "childNodes", term753);
        setField(term757, term757.getClass(), "attributes", term758);
        setField(term710, term710.getClass(), "attributes", term757);
        setField(term710, term710.getClass(), "baseUri", "vrQLuWIDJX");
        setIntField(term710, term710.getClass(), "siblingIndex", -616727354);
        Class<? extends Object> term9118 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term9117 = ((Class) term9118).getDeclaredField((String) "quirks");
        ((Field) term9117).setAccessible(true);
        Object enum23 = ((Field) term9117).get((Object) null);
        HashMap term8889 = new HashMap();
        Set<Object> term9327 =  ((Map) term8889).keySet();
        HashSet term8888 = new HashSet((Collection<? extends Object>) term9327);
        ArrayList term8890 = new ArrayList();
        ((ArrayList) term8890).add((Object)null);
        ((ArrayList) term8890).add((Object)null);
        ((ArrayList) term8890).add((Object)null);
        ((ArrayList) term8890).add((Object)null);
        ((ArrayList) term8890).add((Object)null);
        ((ArrayList) term8890).add((Object)null);
        LinkedHashMap term8893 = new LinkedHashMap();
        term8880 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term8881 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term8885 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8892 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8881, term8881.getClass(), "escapeMode", null);
        setField(term8881, term8881.getClass(), "charset", null);
        setField(term8881, term8881.getClass(), "charsetEncoder", null);
        setBooleanField(term8881, term8881.getClass(), "prettyPrint", true);
        setIntField(term8881, term8881.getClass(), "indentAmount", -1922583790);
        setField(term8880, term8880.getClass(), "outputSettings", term8881);
        setField(term8880, term8880.getClass(), "quirksMode", enum23);
        setField(term8885, term8885.getClass(), "tagName", "hNxWaHcfhY");
        setBooleanField(term8885, term8885.getClass(), "isBlock", true);
        setBooleanField(term8885, term8885.getClass(), "formatAsBlock", false);
        setBooleanField(term8885, term8885.getClass(), "canContainBlock", false);
        setBooleanField(term8885, term8885.getClass(), "canContainInline", true);
        setBooleanField(term8885, term8885.getClass(), "empty", true);
        setBooleanField(term8885, term8885.getClass(), "selfClosing", true);
        setBooleanField(term8885, term8885.getClass(), "preserveWhitespace", true);
        setField(term8880, term8880.getClass(), "tag", term8885);
        setField(term8880, term8880.getClass(), "classNames", term8888);
        setField(term8880, term8880.getClass(), "parentNode", null);
        setField(term8880, term8880.getClass(), "childNodes", term8890);
        setField(term8892, term8892.getClass(), "attributes", term8893);
        setField(term8880, term8880.getClass(), "attributes", term8892);
        setField(term8880, term8880.getClass(), "baseUri", "vrQLuWIDJX");
        setIntField(term8880, term8880.getClass(), "siblingIndex", -616727354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "title", argTypes, term710, args);
        assertTrue(recursiveEquals(term710, term8880));
        assertTrue(recursiveEquals(retValue, ""));
    }

};



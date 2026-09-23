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
import java.lang.NullPointerException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Document_text_8971970831 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3441;

    public Document_text_8971970831() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term15461 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term15460 = ((Class) term15461).getDeclaredField((String) "quirks");
        ((Field) term15460).setAccessible(true);
        Object enum36 = ((Field) term15460).get((Object) null);
        HashMap term3476 = new HashMap();
        Set<Object> term15670 =  ((Map) term3476).keySet();
        HashSet term3475 = new HashSet((Collection<? extends Object>) term15670);
        ArrayList term3490 = new ArrayList();
        ((ArrayList) term3490).add((Object)null);
        ((ArrayList) term3490).add((Object)null);
        ((ArrayList) term3490).add((Object)null);
        ((ArrayList) term3490).add((Object)null);
        ((ArrayList) term3490).add((Object)null);
        ((ArrayList) term3490).add((Object)null);
        LinkedHashMap term3495 = new LinkedHashMap();
        term3441 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term3442 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term3455 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3494 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3442, term3442.getClass(), "escapeMode", null);
        setField(term3442, term3442.getClass(), "charset", null);
        setField(term3442, term3442.getClass(), "charsetEncoder", null);
        setBooleanField(term3442, term3442.getClass(), "prettyPrint", false);
        setIntField(term3442, term3442.getClass(), "indentAmount", -2068769794);
        setField(term3441, term3441.getClass(), "outputSettings", term3442);
        setField(term3441, term3441.getClass(), "quirksMode", enum36);
        setField(term3455, term3455.getClass(), "tagName", "XylxrMBraH");
        setBooleanField(term3455, term3455.getClass(), "isBlock", false);
        setBooleanField(term3455, term3455.getClass(), "formatAsBlock", true);
        setBooleanField(term3455, term3455.getClass(), "canContainBlock", true);
        setBooleanField(term3455, term3455.getClass(), "canContainInline", true);
        setBooleanField(term3455, term3455.getClass(), "empty", false);
        setBooleanField(term3455, term3455.getClass(), "selfClosing", true);
        setBooleanField(term3455, term3455.getClass(), "preserveWhitespace", true);
        setField(term3441, term3441.getClass(), "tag", term3455);
        setField(term3441, term3441.getClass(), "classNames", term3475);
        setField(term3441, term3441.getClass(), "parentNode", null);
        setField(term3441, term3441.getClass(), "childNodes", term3490);
        setField(term3494, term3494.getClass(), "attributes", term3495);
        setField(term3441, term3441.getClass(), "attributes", term3494);
        setField(term3441, term3441.getClass(), "baseUri", "JDaAnsVTGV");
        setIntField(term3441, term3441.getClass(), "siblingIndex", -117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "mLUZFTfjle";
        try {
            callMethod(klass, "text", argTypes, term3441, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



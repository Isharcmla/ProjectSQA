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

public class Document_head_10227755021 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45;

    public Document_head_10227755021() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term7109 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term7108 = ((Class) term7109).getDeclaredField((String) "quirks");
        ((Field) term7108).setAccessible(true);
        Object enum18 = ((Field) term7108).get((Object) null);
        HashMap term80 = new HashMap();
        Set<Object> term7318 =  ((Map) term80).keySet();
        HashSet term79 = new HashSet((Collection<? extends Object>) term7318);
        ArrayList term96 = new ArrayList();
        ((ArrayList) term96).add((Object)null);
        ((ArrayList) term96).add((Object)null);
        ((ArrayList) term96).add((Object)null);
        ((ArrayList) term96).add((Object)null);
        LinkedHashMap term101 = new LinkedHashMap();
        term45 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term46 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term59 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term100 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term46, term46.getClass(), "escapeMode", null);
        setField(term46, term46.getClass(), "charset", null);
        setField(term46, term46.getClass(), "charsetEncoder", null);
        setBooleanField(term46, term46.getClass(), "prettyPrint", false);
        setIntField(term46, term46.getClass(), "indentAmount", 568599855);
        setField(term45, term45.getClass(), "outputSettings", term46);
        setField(term45, term45.getClass(), "quirksMode", enum18);
        setField(term59, term59.getClass(), "tagName", "MuLcgQHgqz");
        setBooleanField(term59, term59.getClass(), "isBlock", false);
        setBooleanField(term59, term59.getClass(), "formatAsBlock", false);
        setBooleanField(term59, term59.getClass(), "canContainBlock", false);
        setBooleanField(term59, term59.getClass(), "canContainInline", true);
        setBooleanField(term59, term59.getClass(), "empty", true);
        setBooleanField(term59, term59.getClass(), "selfClosing", true);
        setBooleanField(term59, term59.getClass(), "preserveWhitespace", true);
        setField(term45, term45.getClass(), "tag", term59);
        setField(term45, term45.getClass(), "classNames", term79);
        setField(term45, term45.getClass(), "parentNode", null);
        setField(term45, term45.getClass(), "childNodes", term96);
        setField(term100, term100.getClass(), "attributes", term101);
        setField(term45, term45.getClass(), "attributes", term100);
        setField(term45, term45.getClass(), "baseUri", "uuaPigETmJ");
        setIntField(term45, term45.getClass(), "siblingIndex", 1162663216);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "head", argTypes, term45, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



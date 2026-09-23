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

public class Document_outerHtml_83599336830 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3128;

    public Document_outerHtml_83599336830() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term14893 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term14892 = ((Class) term14893).getDeclaredField((String) "noQuirks");
        ((Field) term14892).setAccessible(true);
        Object enum35 = ((Field) term14892).get((Object) null);
        HashMap term3165 = new HashMap();
        Set<Object> term15108 =  ((Map) term3165).keySet();
        HashSet term3164 = new HashSet((Collection<? extends Object>) term15108);
        ArrayList term3185 = new ArrayList();
        ((ArrayList) term3185).add((Object)null);
        ((ArrayList) term3185).add((Object)null);
        ((ArrayList) term3185).add((Object)null);
        LinkedHashMap term3190 = new LinkedHashMap();
        term3128 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term3129 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term3144 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3189 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term3129, term3129.getClass(), "escapeMode", null);
        setField(term3129, term3129.getClass(), "charset", null);
        setField(term3129, term3129.getClass(), "charsetEncoder", null);
        setBooleanField(term3129, term3129.getClass(), "prettyPrint", true);
        setIntField(term3129, term3129.getClass(), "indentAmount", -655067527);
        setField(term3128, term3128.getClass(), "outputSettings", term3129);
        setField(term3128, term3128.getClass(), "quirksMode", enum35);
        setField(term3144, term3144.getClass(), "tagName", "vjxIhXHxGR");
        setBooleanField(term3144, term3144.getClass(), "isBlock", false);
        setBooleanField(term3144, term3144.getClass(), "formatAsBlock", false);
        setBooleanField(term3144, term3144.getClass(), "canContainBlock", true);
        setBooleanField(term3144, term3144.getClass(), "canContainInline", true);
        setBooleanField(term3144, term3144.getClass(), "empty", true);
        setBooleanField(term3144, term3144.getClass(), "selfClosing", true);
        setBooleanField(term3144, term3144.getClass(), "preserveWhitespace", true);
        setField(term3128, term3128.getClass(), "tag", term3144);
        setField(term3128, term3128.getClass(), "classNames", term3164);
        setField(term3128, term3128.getClass(), "parentNode", null);
        setField(term3128, term3128.getClass(), "childNodes", term3185);
        setField(term3189, term3189.getClass(), "attributes", term3190);
        setField(term3128, term3128.getClass(), "attributes", term3189);
        setField(term3128, term3128.getClass(), "baseUri", "iNwOJRBEjp");
        setIntField(term3128, term3128.getClass(), "siblingIndex", -6029667);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "outerHtml", argTypes, term3128, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



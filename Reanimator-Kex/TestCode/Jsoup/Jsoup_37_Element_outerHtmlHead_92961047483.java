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

public class Element_outerHtmlHead_92961047483 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8104;
     Object term8165;
     Object term8185;
     Object term8187;

    public Element_outerHtmlHead_92961047483() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8128 = new HashMap();
        Set<Object> term8201 =  ((Map) term8128).keySet();
        HashSet term8127 = new HashSet((Collection<? extends Object>) term8201);
        ArrayList term8136 = new ArrayList();
        LinkedHashMap term8141 = new LinkedHashMap();
        term8104 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8105 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8140 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8105, term8105.getClass(), "tagName", "WrzdBkinqV");
        setBooleanField(term8105, term8105.getClass(), "isBlock", false);
        setBooleanField(term8105, term8105.getClass(), "formatAsBlock", false);
        setBooleanField(term8105, term8105.getClass(), "canContainBlock", true);
        setBooleanField(term8105, term8105.getClass(), "canContainInline", false);
        setBooleanField(term8105, term8105.getClass(), "empty", true);
        setBooleanField(term8105, term8105.getClass(), "selfClosing", true);
        setBooleanField(term8105, term8105.getClass(), "preserveWhitespace", true);
        setBooleanField(term8105, term8105.getClass(), "formList", false);
        setBooleanField(term8105, term8105.getClass(), "formSubmit", true);
        setField(term8104, term8104.getClass(), "tag", term8105);
        setField(term8104, term8104.getClass(), "classNames", term8127);
        setField(term8104, term8104.getClass(), "parentNode", null);
        setField(term8104, term8104.getClass(), "childNodes", term8136);
        setField(term8140, term8140.getClass(), "attributes", term8141);
        setField(term8104, term8104.getClass(), "attributes", term8140);
        setField(term8104, term8104.getClass(), "baseUri", "uyLBVQYcOV");
        setIntField(term8104, term8104.getClass(), "siblingIndex", 1041916673);
        term8165 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8166 = (byte[]) newByteArray(16);
        setField(term8165, term8165.getClass(), "value", term8166);
        setByteField(term8165, term8165.getClass(), "coder", (byte) 75);
        setIntField(term8165, term8165.getClass(), "count", -601863069);
        term8185 = new Integer(663292551);
        term8187 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term8187, term8187.getClass(), "escapeMode", null);
        setField(term8187, term8187.getClass(), "charset", null);
        setField(term8187, term8187.getClass(), "charsetEncoder", null);
        setBooleanField(term8187, term8187.getClass(), "prettyPrint", false);
        setBooleanField(term8187, term8187.getClass(), "outline", false);
        setIntField(term8187, term8187.getClass(), "indentAmount", -1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term8165;
        args[1] = term8185;
        args[2] = term8187;
        callMethod(klass, "outerHtmlHead", argTypes, term8104, args);
    }

};



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

public class Element_data_121026680773 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7106;

    public Element_data_121026680773() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term7130 = new HashMap();
        Set<Object> term7187 =  ((Map) term7130).keySet();
        HashSet term7129 = new HashSet((Collection<? extends Object>) term7187);
        ArrayList term7148 = new ArrayList();
        ((ArrayList) term7148).add((Object)null);
        ((ArrayList) term7148).add((Object)null);
        ((ArrayList) term7148).add((Object)null);
        ((ArrayList) term7148).add((Object)null);
        ((ArrayList) term7148).add((Object)null);
        LinkedHashMap term7153 = new LinkedHashMap();
        term7106 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7107 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7152 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7107, term7107.getClass(), "tagName", "SibzENsyyy");
        setBooleanField(term7107, term7107.getClass(), "isBlock", true);
        setBooleanField(term7107, term7107.getClass(), "formatAsBlock", true);
        setBooleanField(term7107, term7107.getClass(), "canContainBlock", false);
        setBooleanField(term7107, term7107.getClass(), "canContainInline", true);
        setBooleanField(term7107, term7107.getClass(), "empty", false);
        setBooleanField(term7107, term7107.getClass(), "selfClosing", true);
        setBooleanField(term7107, term7107.getClass(), "preserveWhitespace", true);
        setBooleanField(term7107, term7107.getClass(), "formList", false);
        setBooleanField(term7107, term7107.getClass(), "formSubmit", false);
        setField(term7106, term7106.getClass(), "tag", term7107);
        setField(term7106, term7106.getClass(), "classNames", term7129);
        setField(term7106, term7106.getClass(), "parentNode", null);
        setField(term7106, term7106.getClass(), "childNodes", term7148);
        setField(term7152, term7152.getClass(), "attributes", term7153);
        setField(term7106, term7106.getClass(), "attributes", term7152);
        setField(term7106, term7106.getClass(), "baseUri", "XiNoscmYhd");
        setIntField(term7106, term7106.getClass(), "siblingIndex", 1398204340);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "data", argTypes, term7106, args);
    }

};



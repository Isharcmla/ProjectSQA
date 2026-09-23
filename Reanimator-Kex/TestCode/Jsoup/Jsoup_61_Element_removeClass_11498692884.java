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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_removeClass_11498692884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6868;

    public Element_removeClass_11498692884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6890 = new ArrayList();
        ((ArrayList) term6890).add((Object)null);
        ((ArrayList) term6890).add((Object)null);
        ((ArrayList) term6890).add((Object)null);
        ((ArrayList) term6890).add((Object)null);
        ((ArrayList) term6890).add((Object)null);
        ((ArrayList) term6890).add((Object)null);
        LinkedHashMap term6895 = new LinkedHashMap();
        term6868 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6869 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6894 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term6869, term6869.getClass(), "tagName", "VkPSXewZfB");
        setBooleanField(term6869, term6869.getClass(), "isBlock", false);
        setBooleanField(term6869, term6869.getClass(), "formatAsBlock", false);
        setBooleanField(term6869, term6869.getClass(), "canContainInline", true);
        setBooleanField(term6869, term6869.getClass(), "empty", false);
        setBooleanField(term6869, term6869.getClass(), "selfClosing", false);
        setBooleanField(term6869, term6869.getClass(), "preserveWhitespace", false);
        setBooleanField(term6869, term6869.getClass(), "formList", true);
        setBooleanField(term6869, term6869.getClass(), "formSubmit", true);
        setField(term6868, term6868.getClass(), "tag", term6869);
        setField(term6868, term6868.getClass(), "parentNode", null);
        setField(term6868, term6868.getClass(), "childNodes", term6890);
        setField(term6894, term6894.getClass(), "attributes", term6895);
        setField(term6868, term6868.getClass(), "attributes", term6894);
        setField(term6868, term6868.getClass(), "baseUri", "WdCiTDUKqn");
        setIntField(term6868, term6868.getClass(), "siblingIndex", -1885090354);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PSizQDoxxe";
        callMethod(klass, "removeClass", argTypes, term6868, args);
    }

};



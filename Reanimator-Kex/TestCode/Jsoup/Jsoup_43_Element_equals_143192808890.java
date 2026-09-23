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

public class Element_equals_143192808890 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8141;
     Object term8193;

    public Element_equals_143192808890() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8164 = new ArrayList();
        ((ArrayList) term8164).add((Object)null);
        ((ArrayList) term8164).add((Object)null);
        ((ArrayList) term8164).add((Object)null);
        ((ArrayList) term8164).add((Object)null);
        ((ArrayList) term8164).add((Object)null);
        LinkedHashMap term8169 = new LinkedHashMap();
        term8141 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8142 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8168 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8142, term8142.getClass(), "tagName", "CAgxWjhxNf");
        setBooleanField(term8142, term8142.getClass(), "isBlock", true);
        setBooleanField(term8142, term8142.getClass(), "formatAsBlock", true);
        setBooleanField(term8142, term8142.getClass(), "canContainBlock", false);
        setBooleanField(term8142, term8142.getClass(), "canContainInline", true);
        setBooleanField(term8142, term8142.getClass(), "empty", false);
        setBooleanField(term8142, term8142.getClass(), "selfClosing", true);
        setBooleanField(term8142, term8142.getClass(), "preserveWhitespace", true);
        setBooleanField(term8142, term8142.getClass(), "formList", false);
        setBooleanField(term8142, term8142.getClass(), "formSubmit", true);
        setField(term8141, term8141.getClass(), "tag", term8142);
        setField(term8141, term8141.getClass(), "parentNode", null);
        setField(term8141, term8141.getClass(), "childNodes", term8164);
        setField(term8168, term8168.getClass(), "attributes", term8169);
        setField(term8141, term8141.getClass(), "attributes", term8168);
        setField(term8141, term8141.getClass(), "baseUri", "mwmFMNEzkK");
        setIntField(term8141, term8141.getClass(), "siblingIndex", -1731761810);
        term8193 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term8193;
        callMethod(klass, "equals", argTypes, term8141, args);
    }

};



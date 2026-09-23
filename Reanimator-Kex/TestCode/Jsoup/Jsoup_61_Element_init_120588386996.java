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

public class Element_init_120588386996 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8548;

    public Element_init_120588386996() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8548 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8549 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8552 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        Object term8553 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8549, term8549.getClass(), "tagName", "PAEBtnZtTD");
        setBooleanField(term8549, term8549.getClass(), "isBlock", false);
        setBooleanField(term8549, term8549.getClass(), "formatAsBlock", true);
        setBooleanField(term8549, term8549.getClass(), "canContainInline", true);
        setBooleanField(term8549, term8549.getClass(), "empty", false);
        setBooleanField(term8549, term8549.getClass(), "selfClosing", false);
        setBooleanField(term8549, term8549.getClass(), "preserveWhitespace", false);
        setBooleanField(term8549, term8549.getClass(), "formList", false);
        setBooleanField(term8549, term8549.getClass(), "formSubmit", false);
        setField(term8548, term8548.getClass(), "tag", term8549);
        setField(term8548, term8548.getClass(), "parentNode", null);
        setIntField(term8552, term8552.getClass(), "modCount", 0);
        setField(term8548, term8548.getClass(), "childNodes", term8552);
        setField(term8553, term8553.getClass(), "attributes", null);
        setField(term8548, term8548.getClass(), "attributes", term8553);
        setField(term8548, term8548.getClass(), "baseUri", "");
        setIntField(term8548, term8548.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "PAEBtnZtTD";
        Object instance = callConstructor(klass, argTypes, args);
        assertTrue(recursiveEquals(instance, term8548));
    }

};



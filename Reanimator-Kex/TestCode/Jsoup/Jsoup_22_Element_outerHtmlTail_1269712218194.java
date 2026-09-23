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
import java.lang.Integer;

public class Element_outerHtmlTail_1269712218194 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29148;
     Object term29150;

    public Element_outerHtmlTail_1269712218194() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term29148 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term29148, term29148.getClass(), "tag", null);
        setField(term29148, term29148.getClass(), "classNames", null);
        setField(term29148, term29148.getClass(), "parentNode", null);
        setField(term29148, term29148.getClass(), "childNodes", null);
        setField(term29148, term29148.getClass(), "attributes", null);
        setField(term29148, term29148.getClass(), "baseUri", null);
        setIntField(term29148, term29148.getClass(), "siblingIndex", 0);
        term29150 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term29150;
        args[2] = null;
        callMethod(klass, "outerHtmlTail", argTypes, term29148, args);
    }

};



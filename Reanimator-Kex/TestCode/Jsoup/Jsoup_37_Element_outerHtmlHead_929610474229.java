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

public class Element_outerHtmlHead_929610474229 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term61628;
     Object term61630;

    public Element_outerHtmlHead_929610474229() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term61628 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        setField(term61628, term61628.getClass(), "tag", null);
        setField(term61628, term61628.getClass(), "classNames", null);
        setField(term61628, term61628.getClass(), "parentNode", null);
        setField(term61628, term61628.getClass(), "childNodes", null);
        setField(term61628, term61628.getClass(), "attributes", null);
        setField(term61628, term61628.getClass(), "baseUri", null);
        setIntField(term61628, term61628.getClass(), "siblingIndex", 0);
        term61630 = new Integer(0);
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
        args[1] = term61630;
        args[2] = null;
        callMethod(klass, "outerHtmlHead", argTypes, term61628, args);
    }

};



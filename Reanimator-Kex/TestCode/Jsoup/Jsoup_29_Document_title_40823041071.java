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
import java.lang.ClassCastException;
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class Document_title_40823041071 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29362;

    public Document_title_40823041071() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term29590 = newInstance(Class.forName("org.jsoup.select.StructuralEvaluator$Parent"));
        ArrayList term29498 = new ArrayList();
        ((ArrayList) term29498).add(term29590);
        term29362 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term29408 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term29408, term29408.getClass(), "tagName", "");
        setField(term29362, term29362.getClass(), "tag", term29408);
        setField(term29362, term29362.getClass(), "childNodes", term29498);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "";
        try {
            callMethod(klass, "title", argTypes, term29362, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



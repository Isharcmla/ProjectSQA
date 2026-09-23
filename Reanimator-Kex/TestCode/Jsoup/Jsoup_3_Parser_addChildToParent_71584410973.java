package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.LinkedList;
import java.lang.Object;
import java.util.ArrayList;

public class Parser_addChildToParent_71584410973 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term45182;
     Object term45378;

    public Parser_addChildToParent_71584410973() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedList term45236 = new LinkedList();
        term45182 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        setField(term45182, term45182.getClass(), "stack", term45236);
        setField(term45182, term45182.getClass(), "baseUri", "org.vorpal.research.kex.intrinsics.UnknownIntrinsics");
        Object term45499 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        ArrayList term45453 = new ArrayList();
        ((ArrayList) term45453).add(term45499);
        term45378 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term45401 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term45401, term45401.getClass(), "ancestors", term45453);
        setBooleanField(term45401, term45401.getClass(), "canContainBlock", true);
        setBooleanField(term45401, term45401.getClass(), "canContainInline", false);
        setField(term45378, term45378.getClass(), "tag", term45401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.Parser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.nodes.Element");
        argTypes[1] = boolean.class;
        Object[] args = new Object[2];
        args[0] = term45378;
        args[1] = false;
        try {
            callMethod(klass, "addChildToParent", argTypes, term45182, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



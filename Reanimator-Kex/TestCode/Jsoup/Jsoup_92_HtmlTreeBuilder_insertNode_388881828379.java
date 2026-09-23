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
import java.util.ArrayList;
import java.lang.Object;

public class HtmlTreeBuilder_insertNode_388881828379 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term353131;
     Object term353295;

    public HtmlTreeBuilder_insertNode_388881828379() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term353235 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        ArrayList term353183 = new ArrayList();
        ((ArrayList) term353183).add((Object)null);
        ((ArrayList) term353183).add(term353235);
        term353131 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        setField(term353131, term353131.getClass(), "stack", term353183);
        setBooleanField(term353131, term353131.getClass(), "fosterInserts", false);
        term353295 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Node");
        Object[] args = new Object[1];
        args[0] = term353295;
        try {
            callMethod(klass, "insertNode", argTypes, term353131, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



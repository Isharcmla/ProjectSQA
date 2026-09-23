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
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inScope_453351309317 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term339321;

    public HtmlTreeBuilder_inScope_453351309317() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term339487 = newInstance(Class.forName("java.lang.Object"));
        Object term339547 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        Object term339593 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term339547, term339547.getClass(), "tag", term339593);
        ArrayList term339449 = new ArrayList();
        ((ArrayList) term339449).add(term339487);
        ((ArrayList) term339449).add(term339547);
        term339321 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term339205 = (Object[]) newArray("java.lang.String", 2);
        setElement(term339205, 0, "");
        setElement(term339205, 1, "");
        setField(term339321, term339321.getClass(), "specificScopeTarget", term339205);
        setField(term339321, term339321.getClass(), "stack", term339449);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = "";
        args[1] = null;
        try {
            callMethod(klass, "inScope", argTypes, term339321, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



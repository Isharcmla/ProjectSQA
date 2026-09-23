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

public class HtmlTreeBuilder_inSpecificScope_852106786410 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term275240;

    public HtmlTreeBuilder_inSpecificScope_852106786410() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term275346 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term275292 = new ArrayList();
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        ((ArrayList) term275292).add(term275346);
        term275240 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term275134 = (Object[]) newArray("java.lang.String", 1);
        setField(term275240, term275240.getClass(), "specificScopeTarget", term275134);
        setField(term275240, term275240.getClass(), "stack", term275292);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "inSpecificScope", argTypes, term275240, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



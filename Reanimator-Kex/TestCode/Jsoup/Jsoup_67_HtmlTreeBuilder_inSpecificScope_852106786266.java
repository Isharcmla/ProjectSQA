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

public class HtmlTreeBuilder_inSpecificScope_852106786266 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term216895;

    public HtmlTreeBuilder_inSpecificScope_852106786266() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term216985 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term216947 = new ArrayList();
        ((ArrayList) term216947).add(term216985);
        ((ArrayList) term216947).add((Object)null);
        ((ArrayList) term216947).add((Object)null);
        ((ArrayList) term216947).add((Object)null);
        term216895 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term216801 = (Object[]) newArray("java.lang.String", 234);
        setField(term216895, term216895.getClass(), "specificScopeTarget", term216801);
        setField(term216895, term216895.getClass(), "stack", term216947);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[2] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[3];
        args[0] = "";
        args[1] = null;
        args[2] = null;
        try {
            callMethod(klass, "inSpecificScope", argTypes, term216895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



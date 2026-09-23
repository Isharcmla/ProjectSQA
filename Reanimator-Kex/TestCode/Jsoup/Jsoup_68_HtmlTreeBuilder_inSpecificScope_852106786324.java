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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;

public class HtmlTreeBuilder_inSpecificScope_852106786324 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283280;

    public HtmlTreeBuilder_inSpecificScope_852106786324() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term283370 = newInstance(Class.forName("java.lang.Object"));
        ArrayList term283332 = new ArrayList();
        ((ArrayList) term283332).add(term283370);
        ((ArrayList) term283332).add(term283370);
        ((ArrayList) term283332).add(term283370);
        ((ArrayList) term283332).add(term283370);
        term283280 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object[] term283182 = (Object[]) newArray("java.lang.String", 490);
        setField(term283280, term283280.getClass(), "specificScopeTarget", term283182);
        setField(term283280, term283280.getClass(), "stack", term283332);
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
            callMethod(klass, "inSpecificScope", argTypes, term283280, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};



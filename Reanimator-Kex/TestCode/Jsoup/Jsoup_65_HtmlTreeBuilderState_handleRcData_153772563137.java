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
import java.lang.IllegalArgumentException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;

public class HtmlTreeBuilderState_handleRcData_153772563137 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term44897;
     Object term45005;

    public HtmlTreeBuilderState_handleRcData_153772563137() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term44897 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term44897, term44897.getClass(), "selfClosing", true);
        setField(term44897, term44897.getClass(), "tagName", "");
        Class<? extends Object> term46313 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term46312 = ((Class) term46313).getDeclaredField((String) "Data");
        ((Field) term46312).setAccessible(true);
        Object enum114 = ((Field) term46312).get((Object) null);
        Class<? extends Object> term46487 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46486 = ((Class) term46487).getDeclaredField((String) "InColumnGroup");
        ((Field) term46486).setAccessible(true);
        Object enum115 = ((Field) term46486).get((Object) null);
        Class<? extends Object> term46718 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term46717 = ((Class) term46718).getDeclaredField((String) "Initial");
        ((Field) term46717).setAccessible(true);
        Object enum116 = ((Field) term46717).get((Object) null);
        term45005 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term45063 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term45063, term45063.getClass(), "state", enum114);
        setField(term45005, term45005.getClass(), "tokeniser", term45063);
        setField(term45005, term45005.getClass(), "state", enum115);
        setField(term45005, term45005.getClass(), "originalState", enum116);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term44897;
        args[1] = term45005;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



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
import java.lang.String;

public class HtmlTreeBuilderState_handleRcData_1537725631438 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term448704;

    public HtmlTreeBuilderState_handleRcData_1537725631438() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term600102 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term600101 = ((Class) term600102).getDeclaredField((String) "Data");
        ((Field) term600101).setAccessible(true);
        Object enum229 = ((Field) term600101).get((Object) null);
        Class<? extends Object> term600276 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term600275 = ((Class) term600276).getDeclaredField((String) "AfterBody");
        ((Field) term600275).setAccessible(true);
        Object enum230 = ((Field) term600275).get((Object) null);
        term448704 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term448762 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term448762, term448762.getClass(), "state", enum229);
        setField(term448704, term448704.getClass(), "tokeniser", term448762);
        setField(term448704, term448704.getClass(), "state", enum230);
        setField(term448704, term448704.getClass(), "originalState", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = term448704;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};



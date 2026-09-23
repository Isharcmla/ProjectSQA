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

public class HtmlTreeBuilderState_handleRcData_153772563125 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term28859;
     Object term28929;

    public HtmlTreeBuilderState_handleRcData_153772563125() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term28859 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        setBooleanField(term28859, term28859.getClass(), "selfClosing", true);
        Class<? extends Object> term30202 = Class.forName((String) "org.jsoup.parser.TokeniserState");
        Field term30201 = ((Class) term30202).getDeclaredField((String) "Data");
        ((Field) term30201).setAccessible(true);
        Object enum77 = ((Field) term30201).get((Object) null);
        Class<? extends Object> term30376 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30375 = ((Class) term30376).getDeclaredField((String) "InCell");
        ((Field) term30375).setAccessible(true);
        Object enum78 = ((Field) term30375).get((Object) null);
        Class<? extends Object> term30586 = Class.forName((String) "org.jsoup.parser.HtmlTreeBuilderState");
        Field term30585 = ((Class) term30586).getDeclaredField((String) "Initial");
        ((Field) term30585).setAccessible(true);
        Object enum79 = ((Field) term30585).get((Object) null);
        term28929 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term28987 = newInstance(Class.forName("org.jsoup.parser.Tokeniser"));
        setField(term28987, term28987.getClass(), "state", enum77);
        setField(term28929, term28929.getClass(), "tokeniser", term28987);
        setField(term28929, term28929.getClass(), "state", enum78);
        setField(term28929, term28929.getClass(), "originalState", enum79);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.HtmlTreeBuilderState");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$StartTag");
        argTypes[1] = Class.forName("org.jsoup.parser.HtmlTreeBuilder");
        Object[] args = new Object[2];
        args[0] = term28859;
        args[1] = term28929;
        try {
            callMethod(klass, "handleRcData", argTypes, null, args);
            assertTrue(false);
        }
        catch (IllegalArgumentException e) {
        }

    }

};



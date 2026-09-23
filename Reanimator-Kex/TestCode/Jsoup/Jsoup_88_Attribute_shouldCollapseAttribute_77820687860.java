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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.String;
import java.lang.Object;

public class Attribute_shouldCollapseAttribute_77820687860 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term141231;
     Object term141391;
     Object term142796;
     Object term142801;

    public Attribute_shouldCollapseAttribute_77820687860() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term141231 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term141231, term141231.getClass(), "key", "xml");
        setField(term141231, term141231.getClass(), "val", "                                         ");
        Class<? extends Object> term142809 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term142808 = ((Class) term142809).getDeclaredField((String) "xml");
        ((Field) term142808).setAccessible(true);
        Object enum35 = ((Field) term142808).get((Object) null);
        term141391 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term141391, term141391.getClass(), "syntax", enum35);
        term142796 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term142796, term142796.getClass(), "key", "xml");
        setField(term142796, term142796.getClass(), "val", "                                         ");
        setField(term142796, term142796.getClass(), "parent", null);
        Class<? extends Object> term143099 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term143098 = ((Class) term143099).getDeclaredField((String) "xml");
        ((Field) term143098).setAccessible(true);
        Object enum36 = ((Field) term143098).get((Object) null);
        term142801 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term142801, term142801.getClass(), "escapeMode", null);
        setField(term142801, term142801.getClass(), "charset", null);
        setField(term142801, term142801.getClass(), "encoderThreadLocal", null);
        setField(term142801, term142801.getClass(), "coreCharset", null);
        setBooleanField(term142801, term142801.getClass(), "prettyPrint", false);
        setBooleanField(term142801, term142801.getClass(), "outline", false);
        setIntField(term142801, term142801.getClass(), "indentAmount", 0);
        setField(term142801, term142801.getClass(), "syntax", enum36);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term141391;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term141231, args);
        assertTrue(recursiveEquals(term141231, term142796));
        assertTrue(recursiveEquals(term141391, term142801));
    }

};



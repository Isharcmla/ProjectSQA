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

public class Attribute_shouldCollapseAttribute_77820687861 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term142037;
     Object term142159;
     Object term143370;
     Object term143373;

    public Attribute_shouldCollapseAttribute_77820687861() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term142037 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term142037, term142037.getClass(), "key", "");
        setField(term142037, term142037.getClass(), "val", null);
        Class<? extends Object> term143378 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term143377 = ((Class) term143378).getDeclaredField((String) "html");
        ((Field) term143377).setAccessible(true);
        Object enum37 = ((Field) term143377).get((Object) null);
        term142159 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term142159, term142159.getClass(), "syntax", enum37);
        term143370 = newInstance(Class.forName("org.jsoup.nodes.Attribute"));
        setField(term143370, term143370.getClass(), "key", "");
        setField(term143370, term143370.getClass(), "val", null);
        setField(term143370, term143370.getClass(), "parent", null);
        Class<? extends Object> term143627 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term143626 = ((Class) term143627).getDeclaredField((String) "xml");
        ((Field) term143626).setAccessible(true);
        Object enum38 = ((Field) term143626).get((Object) null);
        term143373 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term143373, term143373.getClass(), "escapeMode", null);
        setField(term143373, term143373.getClass(), "charset", null);
        setField(term143373, term143373.getClass(), "encoderThreadLocal", null);
        setField(term143373, term143373.getClass(), "coreCharset", null);
        setBooleanField(term143373, term143373.getClass(), "prettyPrint", false);
        setBooleanField(term143373, term143373.getClass(), "outline", false);
        setIntField(term143373, term143373.getClass(), "indentAmount", 0);
        setField(term143373, term143373.getClass(), "syntax", enum38);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[1];
        args[0] = term142159;
        callMethod(klass, "shouldCollapseAttribute", argTypes, term142037, args);
        assertTrue(recursiveEquals(term142037, term143370));
        assertTrue(recursiveEquals(term142159, term143373));
    }

};



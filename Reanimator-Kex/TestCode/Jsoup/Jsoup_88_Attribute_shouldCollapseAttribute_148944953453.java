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

public class Attribute_shouldCollapseAttribute_148944953453 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term138568;
     Object term139621;

    public Attribute_shouldCollapseAttribute_148944953453() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term139629 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term139628 = ((Class) term139629).getDeclaredField((String) "xml");
        ((Field) term139628).setAccessible(true);
        Object enum31 = ((Field) term139628).get((Object) null);
        term138568 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term138568, term138568.getClass(), "syntax", enum31);
        Class<? extends Object> term139875 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term139874 = ((Class) term139875).getDeclaredField((String) "xml");
        ((Field) term139874).setAccessible(true);
        Object enum32 = ((Field) term139874).get((Object) null);
        term139621 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term139621, term139621.getClass(), "escapeMode", null);
        setField(term139621, term139621.getClass(), "charset", null);
        setField(term139621, term139621.getClass(), "encoderThreadLocal", null);
        setField(term139621, term139621.getClass(), "coreCharset", null);
        setBooleanField(term139621, term139621.getClass(), "prettyPrint", false);
        setBooleanField(term139621, term139621.getClass(), "outline", false);
        setIntField(term139621, term139621.getClass(), "indentAmount", 0);
        setField(term139621, term139621.getClass(), "syntax", enum32);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Attribute");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = "                                                                                                                                                                                                                                                                ";
        args[2] = term138568;
        Object retValue = callMethod(klass, "shouldCollapseAttribute", argTypes, null, args);
        assertTrue(recursiveEquals(term138568, "                                                                                                                                                                                                                                                                "));
        assertTrue(recursiveEquals(retValue, false));
    }

};



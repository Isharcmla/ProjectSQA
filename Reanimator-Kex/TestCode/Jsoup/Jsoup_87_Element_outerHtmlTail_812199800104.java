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
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Integer;
import java.lang.String;

public class Element_outerHtmlTail_812199800104 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52988;
     Object term53035;
     Object term53037;

    public Element_outerHtmlTail_812199800104() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term53014 = new ArrayList();
        ((ArrayList) term53014).add((Object)null);
        ((ArrayList) term53014).add((Object)null);
        ((ArrayList) term53014).add((Object)null);
        ((ArrayList) term53014).add((Object)null);
        ((ArrayList) term53014).add((Object)null);
        term52988 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term52989 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term53010 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term53011 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term53012 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term53018 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term53020 = (Object[]) newArray("java.lang.String", 0);
        Object[] term53021 = (Object[]) newArray("java.lang.String", 0);
        setField(term52989, term52989.getClass(), "tagName", "UBRmXJmfrt");
        setBooleanField(term52989, term52989.getClass(), "isBlock", true);
        setBooleanField(term52989, term52989.getClass(), "formatAsBlock", false);
        setBooleanField(term52989, term52989.getClass(), "canContainInline", false);
        setBooleanField(term52989, term52989.getClass(), "empty", true);
        setBooleanField(term52989, term52989.getClass(), "selfClosing", true);
        setBooleanField(term52989, term52989.getClass(), "preserveWhitespace", false);
        setBooleanField(term52989, term52989.getClass(), "formList", true);
        setBooleanField(term52989, term52989.getClass(), "formSubmit", true);
        setField(term52988, term52988.getClass(), "tag", term52989);
        setField(term53010, term53010.getClass(), "referent", null);
        setField(term53011, term53011.getClass(), "lock", term53012);
        setField(term53011, term53011.getClass(), "head", null);
        setLongField(term53011, term53011.getClass(), "queueLength", -8085190702504231560L);
        setField(term53010, term53010.getClass(), "queue", term53011);
        setField(term53010, term53010.getClass(), "next", null);
        setField(term53010, term53010.getClass(), "discovered", null);
        setField(term52988, term52988.getClass(), "shadowChildrenRef", term53010);
        setField(term52988, term52988.getClass(), "childNodes", term53014);
        setIntField(term53018, term53018.getClass(), "size", 1466373988);
        setField(term53018, term53018.getClass(), "keys", term53020);
        setField(term53018, term53018.getClass(), "vals", term53021);
        setField(term52988, term52988.getClass(), "attributes", term53018);
        setField(term52988, term52988.getClass(), "baseUri", "WZzvmIHhzZ");
        setField(term52988, term52988.getClass(), "parentNode", null);
        setIntField(term52988, term52988.getClass(), "siblingIndex", -358526505);
        term53035 = new Integer(1843268026);
        Class<? extends Object> term54790 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term54789 = ((Class) term54790).getDeclaredField((String) "base");
        ((Field) term54789).setAccessible(true);
        Object enum3 = ((Field) term54789).get((Object) null);
        Class<? extends Object> term55010 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term55009 = ((Class) term55010).getDeclaredField((String) "fallback");
        ((Field) term55009).setAccessible(true);
        Object enum4 = ((Field) term55009).get((Object) null);
        Class<? extends Object> term55221 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term55220 = ((Class) term55221).getDeclaredField((String) "html");
        ((Field) term55220).setAccessible(true);
        Object enum5 = ((Field) term55220).get((Object) null);
        term53037 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term54710 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term54718 = (Object[]) newArray("java.lang.String", 2);
        Object term54744 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term53037, term53037.getClass(), "escapeMode", enum3);
        setField(term54710, term54710.getClass(), "name", "UTF-8");
        setElement(term54718, 0, "UTF8");
        setElement(term54718, 1, "unicode-1-1-utf-8");
        setField(term54710, term54710.getClass(), "aliases", term54718);
        setField(term54710, term54710.getClass(), "aliasSet", null);
        setField(term53037, term53037.getClass(), "charset", term54710);
        setIntField(term54744, term54744.getClass(), "threadLocalHashCode", -1563648377);
        setField(term53037, term53037.getClass(), "encoderThreadLocal", term54744);
        setField(term53037, term53037.getClass(), "coreCharset", enum4);
        setBooleanField(term53037, term53037.getClass(), "prettyPrint", true);
        setBooleanField(term53037, term53037.getClass(), "outline", false);
        setIntField(term53037, term53037.getClass(), "indentAmount", 1);
        setField(term53037, term53037.getClass(), "syntax", enum5);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = term53035;
        args[2] = term53037;
        callMethod(klass, "outerHtmlTail", argTypes, term52988, args);
    }

};



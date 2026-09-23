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

public class Element_outerHtmlHead_1152301544103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7979;
     Object term8026;
     Object term8028;

    public Element_outerHtmlHead_1152301544103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8005 = new ArrayList();
        ((ArrayList) term8005).add((Object)null);
        ((ArrayList) term8005).add((Object)null);
        term7979 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7980 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8001 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term8002 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term8003 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term8009 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8011 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8012 = (Object[]) newArray("java.lang.String", 0);
        setField(term7980, term7980.getClass(), "tagName", "bxrCBbrrct");
        setBooleanField(term7980, term7980.getClass(), "isBlock", false);
        setBooleanField(term7980, term7980.getClass(), "formatAsBlock", true);
        setBooleanField(term7980, term7980.getClass(), "canContainInline", true);
        setBooleanField(term7980, term7980.getClass(), "empty", true);
        setBooleanField(term7980, term7980.getClass(), "selfClosing", true);
        setBooleanField(term7980, term7980.getClass(), "preserveWhitespace", false);
        setBooleanField(term7980, term7980.getClass(), "formList", false);
        setBooleanField(term7980, term7980.getClass(), "formSubmit", false);
        setField(term7979, term7979.getClass(), "tag", term7980);
        setField(term8001, term8001.getClass(), "referent", null);
        setField(term8002, term8002.getClass(), "lock", term8003);
        setField(term8002, term8002.getClass(), "head", null);
        setLongField(term8002, term8002.getClass(), "queueLength", 2135754395358000892L);
        setField(term8001, term8001.getClass(), "queue", term8002);
        setField(term8001, term8001.getClass(), "next", null);
        setField(term8001, term8001.getClass(), "discovered", null);
        setField(term7979, term7979.getClass(), "shadowChildrenRef", term8001);
        setField(term7979, term7979.getClass(), "childNodes", term8005);
        setIntField(term8009, term8009.getClass(), "size", -2013924238);
        setField(term8009, term8009.getClass(), "keys", term8011);
        setField(term8009, term8009.getClass(), "vals", term8012);
        setField(term7979, term7979.getClass(), "attributes", term8009);
        setField(term7979, term7979.getClass(), "baseUri", "CKWpJaaaxX");
        setField(term7979, term7979.getClass(), "parentNode", null);
        setIntField(term7979, term7979.getClass(), "siblingIndex", 579006268);
        term8026 = new Integer(-1694747156);
        Class<? extends Object> term52281 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term52280 = ((Class) term52281).getDeclaredField((String) "base");
        ((Field) term52280).setAccessible(true);
        Object enum0 = ((Field) term52280).get((Object) null);
        Class<? extends Object> term52529 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term52528 = ((Class) term52529).getDeclaredField((String) "utf");
        ((Field) term52528).setAccessible(true);
        Object enum1 = ((Field) term52528).get((Object) null);
        Class<? extends Object> term52740 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term52739 = ((Class) term52740).getDeclaredField((String) "html");
        ((Field) term52739).setAccessible(true);
        Object enum2 = ((Field) term52739).get((Object) null);
        term8028 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term9701 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term9709 = (Object[]) newArray("java.lang.String", 2);
        Object term9735 = newInstance(Class.forName("java.lang.ThreadLocal"));
        setField(term8028, term8028.getClass(), "escapeMode", enum0);
        setField(term9701, term9701.getClass(), "name", "UTF-8");
        setElement(term9709, 0, "UTF8");
        setElement(term9709, 1, "unicode-1-1-utf-8");
        setField(term9701, term9701.getClass(), "aliases", term9709);
        setField(term9701, term9701.getClass(), "aliasSet", null);
        setField(term8028, term8028.getClass(), "charset", term9701);
        setIntField(term9735, term9735.getClass(), "threadLocalHashCode", -401817506);
        setField(term8028, term8028.getClass(), "encoderThreadLocal", term9735);
        setField(term8028, term8028.getClass(), "coreCharset", enum1);
        setBooleanField(term8028, term8028.getClass(), "prettyPrint", true);
        setBooleanField(term8028, term8028.getClass(), "outline", false);
        setIntField(term8028, term8028.getClass(), "indentAmount", 1);
        setField(term8028, term8028.getClass(), "syntax", enum2);
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
        args[1] = term8026;
        args[2] = term8028;
        callMethod(klass, "outerHtmlHead", argTypes, term7979, args);
    }

};



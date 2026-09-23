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

public class Element_outerHtmlTail_812199800100 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term52631;
     Object term52678;
     Object term52680;

    public Element_outerHtmlTail_812199800100() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term52657 = new ArrayList();
        ((ArrayList) term52657).add((Object)null);
        ((ArrayList) term52657).add((Object)null);
        ((ArrayList) term52657).add((Object)null);
        ((ArrayList) term52657).add((Object)null);
        ((ArrayList) term52657).add((Object)null);
        term52631 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term52632 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term52653 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term52654 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term52655 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term52661 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term52663 = (Object[]) newArray("java.lang.String", 0);
        Object[] term52664 = (Object[]) newArray("java.lang.String", 0);
        setField(term52632, term52632.getClass(), "tagName", "UKAReurpHG");
        setBooleanField(term52632, term52632.getClass(), "isBlock", false);
        setBooleanField(term52632, term52632.getClass(), "formatAsBlock", false);
        setBooleanField(term52632, term52632.getClass(), "canContainInline", true);
        setBooleanField(term52632, term52632.getClass(), "empty", true);
        setBooleanField(term52632, term52632.getClass(), "selfClosing", false);
        setBooleanField(term52632, term52632.getClass(), "preserveWhitespace", true);
        setBooleanField(term52632, term52632.getClass(), "formList", false);
        setBooleanField(term52632, term52632.getClass(), "formSubmit", true);
        setField(term52631, term52631.getClass(), "tag", term52632);
        setField(term52653, term52653.getClass(), "referent", null);
        setField(term52654, term52654.getClass(), "lock", term52655);
        setField(term52654, term52654.getClass(), "head", null);
        setLongField(term52654, term52654.getClass(), "queueLength", -8463029266761149071L);
        setField(term52653, term52653.getClass(), "queue", term52654);
        setField(term52653, term52653.getClass(), "next", null);
        setField(term52653, term52653.getClass(), "discovered", null);
        setField(term52631, term52631.getClass(), "shadowChildrenRef", term52653);
        setField(term52631, term52631.getClass(), "childNodes", term52657);
        setIntField(term52661, term52661.getClass(), "size", 49950830);
        setField(term52661, term52661.getClass(), "keys", term52663);
        setField(term52661, term52661.getClass(), "vals", term52664);
        setField(term52631, term52631.getClass(), "attributes", term52661);
        setField(term52631, term52631.getClass(), "baseUri", "WVRMUmrljA");
        setField(term52631, term52631.getClass(), "parentNode", null);
        setIntField(term52631, term52631.getClass(), "siblingIndex", -525257914);
        term52678 = new Integer(147209682);
        Class<? extends Object> term54431 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term54430 = ((Class) term54431).getDeclaredField((String) "base");
        ((Field) term54430).setAccessible(true);
        Object enum3 = ((Field) term54430).get((Object) null);
        Class<? extends Object> term54651 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term54650 = ((Class) term54651).getDeclaredField((String) "fallback");
        ((Field) term54650).setAccessible(true);
        Object enum4 = ((Field) term54650).get((Object) null);
        Class<? extends Object> term54862 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term54861 = ((Class) term54862).getDeclaredField((String) "html");
        ((Field) term54861).setAccessible(true);
        Object enum5 = ((Field) term54861).get((Object) null);
        term52680 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term54353 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term54361 = (Object[]) newArray("java.lang.String", 2);
        setField(term52680, term52680.getClass(), "escapeMode", enum3);
        setField(term54353, term54353.getClass(), "name", "UTF-8");
        setElement(term54361, 0, "UTF8");
        setElement(term54361, 1, "unicode-1-1-utf-8");
        setField(term54353, term54353.getClass(), "aliases", term54361);
        setField(term54353, term54353.getClass(), "aliasSet", null);
        setField(term52680, term52680.getClass(), "charset", term54353);
        setField(term52680, term52680.getClass(), "encoder", null);
        setField(term52680, term52680.getClass(), "coreCharset", enum4);
        setBooleanField(term52680, term52680.getClass(), "prettyPrint", true);
        setBooleanField(term52680, term52680.getClass(), "outline", true);
        setIntField(term52680, term52680.getClass(), "indentAmount", 1);
        setField(term52680, term52680.getClass(), "syntax", enum5);
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
        args[1] = term52678;
        args[2] = term52680;
        callMethod(klass, "outerHtmlTail", argTypes, term52631, args);
    }

};



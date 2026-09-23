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

public class Element_outerHtmlHead_115230154499 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7624;
     Object term7671;
     Object term7673;

    public Element_outerHtmlHead_115230154499() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7650 = new ArrayList();
        ((ArrayList) term7650).add((Object)null);
        term7624 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7625 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7646 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term7647 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term7648 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term7654 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term7656 = (Object[]) newArray("java.lang.String", 0);
        Object[] term7657 = (Object[]) newArray("java.lang.String", 0);
        setField(term7625, term7625.getClass(), "tagName", "PqtVXXZMqK");
        setBooleanField(term7625, term7625.getClass(), "isBlock", false);
        setBooleanField(term7625, term7625.getClass(), "formatAsBlock", false);
        setBooleanField(term7625, term7625.getClass(), "canContainInline", true);
        setBooleanField(term7625, term7625.getClass(), "empty", true);
        setBooleanField(term7625, term7625.getClass(), "selfClosing", true);
        setBooleanField(term7625, term7625.getClass(), "preserveWhitespace", false);
        setBooleanField(term7625, term7625.getClass(), "formList", false);
        setBooleanField(term7625, term7625.getClass(), "formSubmit", true);
        setField(term7624, term7624.getClass(), "tag", term7625);
        setField(term7646, term7646.getClass(), "referent", null);
        setField(term7647, term7647.getClass(), "lock", term7648);
        setField(term7647, term7647.getClass(), "head", null);
        setLongField(term7647, term7647.getClass(), "queueLength", -2177368829816872572L);
        setField(term7646, term7646.getClass(), "queue", term7647);
        setField(term7646, term7646.getClass(), "next", null);
        setField(term7646, term7646.getClass(), "discovered", null);
        setField(term7624, term7624.getClass(), "shadowChildrenRef", term7646);
        setField(term7624, term7624.getClass(), "childNodes", term7650);
        setIntField(term7654, term7654.getClass(), "size", -420030135);
        setField(term7654, term7654.getClass(), "keys", term7656);
        setField(term7654, term7654.getClass(), "vals", term7657);
        setField(term7624, term7624.getClass(), "attributes", term7654);
        setField(term7624, term7624.getClass(), "baseUri", "rYbtIDVdnd");
        setField(term7624, term7624.getClass(), "parentNode", null);
        setIntField(term7624, term7624.getClass(), "siblingIndex", 267763294);
        term7671 = new Integer(-1497710478);
        Class<? extends Object> term7741 = Class.forName((String) "org.jsoup.nodes.Entities$CoreCharset");
        Field term7740 = ((Class) term7741).getDeclaredField((String) "utf");
        ((Field) term7740).setAccessible(true);
        Object enum0 = ((Field) term7740).get((Object) null);
        Class<? extends Object> term7952 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term7951 = ((Class) term7952).getDeclaredField((String) "html");
        ((Field) term7951).setAccessible(true);
        Object enum1 = ((Field) term7951).get((Object) null);
        term7673 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term7673, term7673.getClass(), "escapeMode", null);
        setField(term7673, term7673.getClass(), "charset", null);
        setField(term7673, term7673.getClass(), "encoder", null);
        setField(term7673, term7673.getClass(), "coreCharset", enum0);
        setBooleanField(term7673, term7673.getClass(), "prettyPrint", false);
        setBooleanField(term7673, term7673.getClass(), "outline", false);
        setIntField(term7673, term7673.getClass(), "indentAmount", 49950830);
        setField(term7673, term7673.getClass(), "syntax", enum1);
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
        args[1] = term7671;
        args[2] = term7673;
        callMethod(klass, "outerHtmlHead", argTypes, term7624, args);
    }

};



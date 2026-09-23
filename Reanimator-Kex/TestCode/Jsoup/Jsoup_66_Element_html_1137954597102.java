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

public class Element_html_1137954597102 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8820;
     Object term8867;

    public Element_html_1137954597102() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8846 = new ArrayList();
        ((ArrayList) term8846).add((Object)null);
        ((ArrayList) term8846).add((Object)null);
        term8820 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8821 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8842 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term8843 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term8844 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term8850 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term8852 = (Object[]) newArray("java.lang.String", 0);
        Object[] term8853 = (Object[]) newArray("java.lang.String", 0);
        setField(term8821, term8821.getClass(), "tagName", "SIODFGaQhr");
        setBooleanField(term8821, term8821.getClass(), "isBlock", false);
        setBooleanField(term8821, term8821.getClass(), "formatAsBlock", true);
        setBooleanField(term8821, term8821.getClass(), "canContainInline", true);
        setBooleanField(term8821, term8821.getClass(), "empty", true);
        setBooleanField(term8821, term8821.getClass(), "selfClosing", true);
        setBooleanField(term8821, term8821.getClass(), "preserveWhitespace", false);
        setBooleanField(term8821, term8821.getClass(), "formList", false);
        setBooleanField(term8821, term8821.getClass(), "formSubmit", false);
        setField(term8820, term8820.getClass(), "tag", term8821);
        setField(term8842, term8842.getClass(), "referent", null);
        setField(term8843, term8843.getClass(), "lock", term8844);
        setField(term8843, term8843.getClass(), "head", null);
        setLongField(term8843, term8843.getClass(), "queueLength", 7247160664318067468L);
        setField(term8842, term8842.getClass(), "queue", term8843);
        setField(term8842, term8842.getClass(), "next", null);
        setField(term8842, term8842.getClass(), "discovered", null);
        setField(term8820, term8820.getClass(), "shadowChildrenRef", term8842);
        setField(term8820, term8820.getClass(), "childNodes", term8846);
        setIntField(term8850, term8850.getClass(), "size", 1593461795);
        setField(term8850, term8850.getClass(), "keys", term8852);
        setField(term8850, term8850.getClass(), "vals", term8853);
        setField(term8820, term8820.getClass(), "attributes", term8850);
        setField(term8820, term8820.getClass(), "baseUri", "qYzsiuXOgS");
        setField(term8820, term8820.getClass(), "parentNode", null);
        setIntField(term8820, term8820.getClass(), "siblingIndex", 515182546);
        term8867 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8868 = (byte[]) newByteArray(16);
        setField(term8867, term8867.getClass(), "value", term8868);
        setByteField(term8867, term8867.getClass(), "coder", (byte) 75);
        setIntField(term8867, term8867.getClass(), "count", -936895502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term8867;
        callMethod(klass, "html", argTypes, term8820, args);
    }

};



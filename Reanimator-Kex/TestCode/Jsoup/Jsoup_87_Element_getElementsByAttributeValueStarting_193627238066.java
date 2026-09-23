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

public class Element_getElementsByAttributeValueStarting_193627238066 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4877;

    public Element_getElementsByAttributeValueStarting_193627238066() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4903 = new ArrayList();
        ((ArrayList) term4903).add((Object)null);
        ((ArrayList) term4903).add((Object)null);
        ((ArrayList) term4903).add((Object)null);
        ((ArrayList) term4903).add((Object)null);
        term4877 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4878 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4899 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4900 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4901 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4907 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4909 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4910 = (Object[]) newArray("java.lang.String", 0);
        setField(term4878, term4878.getClass(), "tagName", "hMmaoREuCK");
        setBooleanField(term4878, term4878.getClass(), "isBlock", false);
        setBooleanField(term4878, term4878.getClass(), "formatAsBlock", false);
        setBooleanField(term4878, term4878.getClass(), "canContainInline", true);
        setBooleanField(term4878, term4878.getClass(), "empty", true);
        setBooleanField(term4878, term4878.getClass(), "selfClosing", false);
        setBooleanField(term4878, term4878.getClass(), "preserveWhitespace", true);
        setBooleanField(term4878, term4878.getClass(), "formList", false);
        setBooleanField(term4878, term4878.getClass(), "formSubmit", true);
        setField(term4877, term4877.getClass(), "tag", term4878);
        setField(term4899, term4899.getClass(), "referent", null);
        setField(term4900, term4900.getClass(), "lock", term4901);
        setField(term4900, term4900.getClass(), "head", null);
        setLongField(term4900, term4900.getClass(), "queueLength", 2062173786000223358L);
        setField(term4899, term4899.getClass(), "queue", term4900);
        setField(term4899, term4899.getClass(), "next", null);
        setField(term4899, term4899.getClass(), "discovered", null);
        setField(term4877, term4877.getClass(), "shadowChildrenRef", term4899);
        setField(term4877, term4877.getClass(), "childNodes", term4903);
        setIntField(term4907, term4907.getClass(), "size", 96566506);
        setField(term4907, term4907.getClass(), "keys", term4909);
        setField(term4907, term4907.getClass(), "vals", term4910);
        setField(term4877, term4877.getClass(), "attributes", term4907);
        setField(term4877, term4877.getClass(), "baseUri", "VeDtgDzGAN");
        setField(term4877, term4877.getClass(), "parentNode", null);
        setIntField(term4877, term4877.getClass(), "siblingIndex", -343325701);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "aWYOWZFyaX";
        args[1] = "BRIVNtfUWU";
        callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4877, args);
    }

};



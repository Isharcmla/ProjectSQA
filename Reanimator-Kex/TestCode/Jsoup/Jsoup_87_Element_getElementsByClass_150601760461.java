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

public class Element_getElementsByClass_150601760461 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4388;

    public Element_getElementsByClass_150601760461() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4414 = new ArrayList();
        ((ArrayList) term4414).add((Object)null);
        ((ArrayList) term4414).add((Object)null);
        ((ArrayList) term4414).add((Object)null);
        ((ArrayList) term4414).add((Object)null);
        ((ArrayList) term4414).add((Object)null);
        ((ArrayList) term4414).add((Object)null);
        ((ArrayList) term4414).add((Object)null);
        term4388 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4389 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4410 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term4411 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term4412 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term4418 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term4420 = (Object[]) newArray("java.lang.String", 0);
        Object[] term4421 = (Object[]) newArray("java.lang.String", 0);
        setField(term4389, term4389.getClass(), "tagName", "mvrkADEgpp");
        setBooleanField(term4389, term4389.getClass(), "isBlock", true);
        setBooleanField(term4389, term4389.getClass(), "formatAsBlock", false);
        setBooleanField(term4389, term4389.getClass(), "canContainInline", false);
        setBooleanField(term4389, term4389.getClass(), "empty", true);
        setBooleanField(term4389, term4389.getClass(), "selfClosing", false);
        setBooleanField(term4389, term4389.getClass(), "preserveWhitespace", true);
        setBooleanField(term4389, term4389.getClass(), "formList", false);
        setBooleanField(term4389, term4389.getClass(), "formSubmit", false);
        setField(term4388, term4388.getClass(), "tag", term4389);
        setField(term4410, term4410.getClass(), "referent", null);
        setField(term4411, term4411.getClass(), "lock", term4412);
        setField(term4411, term4411.getClass(), "head", null);
        setLongField(term4411, term4411.getClass(), "queueLength", 3892018155439224435L);
        setField(term4410, term4410.getClass(), "queue", term4411);
        setField(term4410, term4410.getClass(), "next", null);
        setField(term4410, term4410.getClass(), "discovered", null);
        setField(term4388, term4388.getClass(), "shadowChildrenRef", term4410);
        setField(term4388, term4388.getClass(), "childNodes", term4414);
        setIntField(term4418, term4418.getClass(), "size", 1861318859);
        setField(term4418, term4418.getClass(), "keys", term4420);
        setField(term4418, term4418.getClass(), "vals", term4421);
        setField(term4388, term4388.getClass(), "attributes", term4418);
        setField(term4388, term4388.getClass(), "baseUri", "pXOkjyeIRb");
        setField(term4388, term4388.getClass(), "parentNode", null);
        setIntField(term4388, term4388.getClass(), "siblingIndex", 1474524152);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "GgZWSjxjyE";
        callMethod(klass, "getElementsByClass", argTypes, term4388, args);
    }

};



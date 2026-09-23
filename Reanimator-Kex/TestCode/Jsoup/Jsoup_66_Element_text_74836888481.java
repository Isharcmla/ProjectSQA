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

public class Element_text_74836888481 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6302;

    public Element_text_74836888481() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6328 = new ArrayList();
        ((ArrayList) term6328).add((Object)null);
        ((ArrayList) term6328).add((Object)null);
        ((ArrayList) term6328).add((Object)null);
        ((ArrayList) term6328).add((Object)null);
        ((ArrayList) term6328).add((Object)null);
        ((ArrayList) term6328).add((Object)null);
        term6302 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6303 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6324 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6325 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6326 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6332 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6334 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6335 = (Object[]) newArray("java.lang.String", 0);
        setField(term6303, term6303.getClass(), "tagName", "vGiuZVPJNH");
        setBooleanField(term6303, term6303.getClass(), "isBlock", false);
        setBooleanField(term6303, term6303.getClass(), "formatAsBlock", true);
        setBooleanField(term6303, term6303.getClass(), "canContainInline", true);
        setBooleanField(term6303, term6303.getClass(), "empty", false);
        setBooleanField(term6303, term6303.getClass(), "selfClosing", false);
        setBooleanField(term6303, term6303.getClass(), "preserveWhitespace", true);
        setBooleanField(term6303, term6303.getClass(), "formList", false);
        setBooleanField(term6303, term6303.getClass(), "formSubmit", true);
        setField(term6302, term6302.getClass(), "tag", term6303);
        setField(term6324, term6324.getClass(), "referent", null);
        setField(term6325, term6325.getClass(), "lock", term6326);
        setField(term6325, term6325.getClass(), "head", null);
        setLongField(term6325, term6325.getClass(), "queueLength", -5963439350418910964L);
        setField(term6324, term6324.getClass(), "queue", term6325);
        setField(term6324, term6324.getClass(), "next", null);
        setField(term6324, term6324.getClass(), "discovered", null);
        setField(term6302, term6302.getClass(), "shadowChildrenRef", term6324);
        setField(term6302, term6302.getClass(), "childNodes", term6328);
        setIntField(term6332, term6332.getClass(), "size", 371943306);
        setField(term6332, term6332.getClass(), "keys", term6334);
        setField(term6332, term6332.getClass(), "vals", term6335);
        setField(term6302, term6302.getClass(), "attributes", term6332);
        setField(term6302, term6302.getClass(), "baseUri", "tlzpzIjMib");
        setField(term6302, term6302.getClass(), "parentNode", null);
        setIntField(term6302, term6302.getClass(), "siblingIndex", 982388293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "text", argTypes, term6302, args);
    }

};



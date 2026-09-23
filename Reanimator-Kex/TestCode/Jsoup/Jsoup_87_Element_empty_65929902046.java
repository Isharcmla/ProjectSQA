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

public class Element_empty_65929902046 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3312;

    public Element_empty_65929902046() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term3338 = new ArrayList();
        ((ArrayList) term3338).add((Object)null);
        ((ArrayList) term3338).add((Object)null);
        ((ArrayList) term3338).add((Object)null);
        term3312 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term3313 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term3334 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term3335 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term3336 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term3342 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term3344 = (Object[]) newArray("java.lang.String", 0);
        Object[] term3345 = (Object[]) newArray("java.lang.String", 0);
        setField(term3313, term3313.getClass(), "tagName", "fztQhjqwdP");
        setBooleanField(term3313, term3313.getClass(), "isBlock", true);
        setBooleanField(term3313, term3313.getClass(), "formatAsBlock", true);
        setBooleanField(term3313, term3313.getClass(), "canContainInline", true);
        setBooleanField(term3313, term3313.getClass(), "empty", false);
        setBooleanField(term3313, term3313.getClass(), "selfClosing", true);
        setBooleanField(term3313, term3313.getClass(), "preserveWhitespace", true);
        setBooleanField(term3313, term3313.getClass(), "formList", true);
        setBooleanField(term3313, term3313.getClass(), "formSubmit", false);
        setField(term3312, term3312.getClass(), "tag", term3313);
        setField(term3334, term3334.getClass(), "referent", null);
        setField(term3335, term3335.getClass(), "lock", term3336);
        setField(term3335, term3335.getClass(), "head", null);
        setLongField(term3335, term3335.getClass(), "queueLength", 4784595517102746672L);
        setField(term3334, term3334.getClass(), "queue", term3335);
        setField(term3334, term3334.getClass(), "next", null);
        setField(term3334, term3334.getClass(), "discovered", null);
        setField(term3312, term3312.getClass(), "shadowChildrenRef", term3334);
        setField(term3312, term3312.getClass(), "childNodes", term3338);
        setIntField(term3342, term3342.getClass(), "size", -505439934);
        setField(term3342, term3342.getClass(), "keys", term3344);
        setField(term3342, term3342.getClass(), "vals", term3345);
        setField(term3312, term3312.getClass(), "attributes", term3342);
        setField(term3312, term3312.getClass(), "baseUri", "eVpkWxjuki");
        setField(term3312, term3312.getClass(), "parentNode", null);
        setIntField(term3312, term3312.getClass(), "siblingIndex", -344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "empty", argTypes, term3312, args);
    }

};



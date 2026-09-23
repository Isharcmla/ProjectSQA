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
import java.lang.Object;
import java.util.ArrayList;

public class Element_empty_659299020154 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3312;
     Object term23212;
     Object term23165;

    public Element_empty_659299020154() {
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
        setBooleanField(term3313, term3313.getClass(), "canContainInline", false);
        setBooleanField(term3313, term3313.getClass(), "empty", true);
        setBooleanField(term3313, term3313.getClass(), "selfClosing", true);
        setBooleanField(term3313, term3313.getClass(), "preserveWhitespace", true);
        setBooleanField(term3313, term3313.getClass(), "formList", false);
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
        ArrayList term23219 = new ArrayList();
        term23212 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23213 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23216 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term23217 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term23218 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term23221 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term23222 = (Object[]) newArray("java.lang.String", 0);
        Object[] term23223 = (Object[]) newArray("java.lang.String", 0);
        setField(term23213, term23213.getClass(), "tagName", "fztQhjqwdP");
        setBooleanField(term23213, term23213.getClass(), "isBlock", true);
        setBooleanField(term23213, term23213.getClass(), "formatAsBlock", true);
        setBooleanField(term23213, term23213.getClass(), "canContainInline", false);
        setBooleanField(term23213, term23213.getClass(), "empty", true);
        setBooleanField(term23213, term23213.getClass(), "selfClosing", true);
        setBooleanField(term23213, term23213.getClass(), "preserveWhitespace", true);
        setBooleanField(term23213, term23213.getClass(), "formList", false);
        setBooleanField(term23213, term23213.getClass(), "formSubmit", false);
        setField(term23212, term23212.getClass(), "tag", term23213);
        setField(term23216, term23216.getClass(), "referent", null);
        setField(term23217, term23217.getClass(), "lock", term23218);
        setField(term23217, term23217.getClass(), "head", null);
        setLongField(term23217, term23217.getClass(), "queueLength", 4784595517102746672L);
        setField(term23216, term23216.getClass(), "queue", term23217);
        setField(term23216, term23216.getClass(), "next", null);
        setField(term23216, term23216.getClass(), "discovered", null);
        setField(term23212, term23212.getClass(), "shadowChildrenRef", term23216);
        setField(term23212, term23212.getClass(), "childNodes", term23219);
        setIntField(term23221, term23221.getClass(), "size", -505439934);
        setField(term23221, term23221.getClass(), "keys", term23222);
        setField(term23221, term23221.getClass(), "vals", term23223);
        setField(term23212, term23212.getClass(), "attributes", term23221);
        setField(term23212, term23212.getClass(), "baseUri", "eVpkWxjuki");
        setField(term23212, term23212.getClass(), "parentNode", null);
        setIntField(term23212, term23212.getClass(), "siblingIndex", -344842608);
        ArrayList term23191 = new ArrayList();
        term23165 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term23166 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term23187 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term23188 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term23189 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term23195 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term23197 = (Object[]) newArray("java.lang.String", 0);
        Object[] term23198 = (Object[]) newArray("java.lang.String", 0);
        setField(term23166, term23166.getClass(), "tagName", "fztQhjqwdP");
        setBooleanField(term23166, term23166.getClass(), "isBlock", true);
        setBooleanField(term23166, term23166.getClass(), "formatAsBlock", true);
        setBooleanField(term23166, term23166.getClass(), "canContainInline", false);
        setBooleanField(term23166, term23166.getClass(), "empty", true);
        setBooleanField(term23166, term23166.getClass(), "selfClosing", true);
        setBooleanField(term23166, term23166.getClass(), "preserveWhitespace", true);
        setBooleanField(term23166, term23166.getClass(), "formList", false);
        setBooleanField(term23166, term23166.getClass(), "formSubmit", false);
        setField(term23165, term23165.getClass(), "tag", term23166);
        setField(term23187, term23187.getClass(), "referent", null);
        setField(term23188, term23188.getClass(), "lock", term23189);
        setField(term23188, term23188.getClass(), "head", null);
        setLongField(term23188, term23188.getClass(), "queueLength", 4784595517102746672L);
        setField(term23187, term23187.getClass(), "queue", term23188);
        setField(term23187, term23187.getClass(), "next", null);
        setField(term23187, term23187.getClass(), "discovered", null);
        setField(term23165, term23165.getClass(), "shadowChildrenRef", term23187);
        setField(term23165, term23165.getClass(), "childNodes", term23191);
        setIntField(term23195, term23195.getClass(), "size", -505439934);
        setField(term23195, term23195.getClass(), "keys", term23197);
        setField(term23195, term23195.getClass(), "vals", term23198);
        setField(term23165, term23165.getClass(), "attributes", term23195);
        setField(term23165, term23165.getClass(), "baseUri", "eVpkWxjuki");
        setField(term23165, term23165.getClass(), "parentNode", null);
        setIntField(term23165, term23165.getClass(), "siblingIndex", -344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term3312, args);
        assertTrue(recursiveEquals(term3312, term23212));
        assertTrue(recursiveEquals(retValue, term23165));
    }

};



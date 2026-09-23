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

public class Element_empty_659299020155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3312;
     Object term194184;
     Object term194117;

    public Element_empty_659299020155() {
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
        setBooleanField(term3313, term3313.getClass(), "selfClosing", false);
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
        ArrayList term194191 = new ArrayList();
        term194184 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term194185 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term194188 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term194189 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term194190 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term194193 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term194194 = (Object[]) newArray("java.lang.String", 0);
        Object[] term194195 = (Object[]) newArray("java.lang.String", 0);
        setField(term194185, term194185.getClass(), "tagName", "fztQhjqwdP");
        setBooleanField(term194185, term194185.getClass(), "isBlock", true);
        setBooleanField(term194185, term194185.getClass(), "formatAsBlock", true);
        setBooleanField(term194185, term194185.getClass(), "canContainInline", true);
        setBooleanField(term194185, term194185.getClass(), "empty", false);
        setBooleanField(term194185, term194185.getClass(), "selfClosing", false);
        setBooleanField(term194185, term194185.getClass(), "preserveWhitespace", true);
        setBooleanField(term194185, term194185.getClass(), "formList", false);
        setBooleanField(term194185, term194185.getClass(), "formSubmit", false);
        setField(term194184, term194184.getClass(), "tag", term194185);
        setField(term194188, term194188.getClass(), "referent", null);
        setField(term194189, term194189.getClass(), "lock", term194190);
        setField(term194189, term194189.getClass(), "head", null);
        setLongField(term194189, term194189.getClass(), "queueLength", 4784595517102746672L);
        setField(term194188, term194188.getClass(), "queue", term194189);
        setField(term194188, term194188.getClass(), "next", null);
        setField(term194188, term194188.getClass(), "discovered", null);
        setField(term194184, term194184.getClass(), "shadowChildrenRef", term194188);
        setField(term194184, term194184.getClass(), "childNodes", term194191);
        setIntField(term194193, term194193.getClass(), "size", -505439934);
        setField(term194193, term194193.getClass(), "keys", term194194);
        setField(term194193, term194193.getClass(), "vals", term194195);
        setField(term194184, term194184.getClass(), "attributes", term194193);
        setField(term194184, term194184.getClass(), "baseUri", "eVpkWxjuki");
        setField(term194184, term194184.getClass(), "parentNode", null);
        setIntField(term194184, term194184.getClass(), "siblingIndex", -344842608);
        ArrayList term194143 = new ArrayList();
        term194117 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term194118 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term194139 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term194140 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term194141 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term194147 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term194149 = (Object[]) newArray("java.lang.String", 0);
        Object[] term194150 = (Object[]) newArray("java.lang.String", 0);
        setField(term194118, term194118.getClass(), "tagName", "fztQhjqwdP");
        setBooleanField(term194118, term194118.getClass(), "isBlock", true);
        setBooleanField(term194118, term194118.getClass(), "formatAsBlock", true);
        setBooleanField(term194118, term194118.getClass(), "canContainInline", true);
        setBooleanField(term194118, term194118.getClass(), "empty", false);
        setBooleanField(term194118, term194118.getClass(), "selfClosing", false);
        setBooleanField(term194118, term194118.getClass(), "preserveWhitespace", true);
        setBooleanField(term194118, term194118.getClass(), "formList", false);
        setBooleanField(term194118, term194118.getClass(), "formSubmit", false);
        setField(term194117, term194117.getClass(), "tag", term194118);
        setField(term194139, term194139.getClass(), "referent", null);
        setField(term194140, term194140.getClass(), "lock", term194141);
        setField(term194140, term194140.getClass(), "head", null);
        setLongField(term194140, term194140.getClass(), "queueLength", 4784595517102746672L);
        setField(term194139, term194139.getClass(), "queue", term194140);
        setField(term194139, term194139.getClass(), "next", null);
        setField(term194139, term194139.getClass(), "discovered", null);
        setField(term194117, term194117.getClass(), "shadowChildrenRef", term194139);
        setField(term194117, term194117.getClass(), "childNodes", term194143);
        setIntField(term194147, term194147.getClass(), "size", -505439934);
        setField(term194147, term194147.getClass(), "keys", term194149);
        setField(term194147, term194147.getClass(), "vals", term194150);
        setField(term194117, term194117.getClass(), "attributes", term194147);
        setField(term194117, term194117.getClass(), "baseUri", "eVpkWxjuki");
        setField(term194117, term194117.getClass(), "parentNode", null);
        setIntField(term194117, term194117.getClass(), "siblingIndex", -344842608);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "empty", argTypes, term3312, args);
        assertTrue(recursiveEquals(term3312, term194184));
        assertTrue(recursiveEquals(retValue, term194117));
    }

};



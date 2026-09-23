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

public class Element_html_1332780889103 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55280;

    public Element_html_1332780889103() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55306 = new ArrayList();
        ((ArrayList) term55306).add((Object)null);
        ((ArrayList) term55306).add((Object)null);
        term55280 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55281 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55302 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55303 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55304 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55310 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55312 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55313 = (Object[]) newArray("java.lang.String", 0);
        setField(term55281, term55281.getClass(), "tagName", "bxrCBbrrct");
        setBooleanField(term55281, term55281.getClass(), "isBlock", false);
        setBooleanField(term55281, term55281.getClass(), "formatAsBlock", false);
        setBooleanField(term55281, term55281.getClass(), "canContainInline", true);
        setBooleanField(term55281, term55281.getClass(), "empty", false);
        setBooleanField(term55281, term55281.getClass(), "selfClosing", false);
        setBooleanField(term55281, term55281.getClass(), "preserveWhitespace", true);
        setBooleanField(term55281, term55281.getClass(), "formList", true);
        setBooleanField(term55281, term55281.getClass(), "formSubmit", false);
        setField(term55280, term55280.getClass(), "tag", term55281);
        setField(term55302, term55302.getClass(), "referent", null);
        setField(term55303, term55303.getClass(), "lock", term55304);
        setField(term55303, term55303.getClass(), "head", null);
        setLongField(term55303, term55303.getClass(), "queueLength", 2135754395358000892L);
        setField(term55302, term55302.getClass(), "queue", term55303);
        setField(term55302, term55302.getClass(), "next", null);
        setField(term55302, term55302.getClass(), "discovered", null);
        setField(term55280, term55280.getClass(), "shadowChildrenRef", term55302);
        setField(term55280, term55280.getClass(), "childNodes", term55306);
        setIntField(term55310, term55310.getClass(), "size", 515182546);
        setField(term55310, term55310.getClass(), "keys", term55312);
        setField(term55310, term55310.getClass(), "vals", term55313);
        setField(term55280, term55280.getClass(), "attributes", term55310);
        setField(term55280, term55280.getClass(), "baseUri", "CKWpJaaaxX");
        setField(term55280, term55280.getClass(), "parentNode", null);
        setIntField(term55280, term55280.getClass(), "siblingIndex", -936895502);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "html", argTypes, term55280, args);
    }

};



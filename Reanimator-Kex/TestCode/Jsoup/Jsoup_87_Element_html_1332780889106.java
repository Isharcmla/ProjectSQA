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

public class Element_html_1332780889106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term55536;

    public Element_html_1332780889106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term55562 = new ArrayList();
        ((ArrayList) term55562).add((Object)null);
        ((ArrayList) term55562).add((Object)null);
        ((ArrayList) term55562).add((Object)null);
        ((ArrayList) term55562).add((Object)null);
        ((ArrayList) term55562).add((Object)null);
        ((ArrayList) term55562).add((Object)null);
        ((ArrayList) term55562).add((Object)null);
        ((ArrayList) term55562).add((Object)null);
        term55536 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term55537 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55558 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term55559 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term55560 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term55566 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term55568 = (Object[]) newArray("java.lang.String", 0);
        Object[] term55569 = (Object[]) newArray("java.lang.String", 0);
        setField(term55537, term55537.getClass(), "tagName", "CGOpQSZZwI");
        setBooleanField(term55537, term55537.getClass(), "isBlock", false);
        setBooleanField(term55537, term55537.getClass(), "formatAsBlock", true);
        setBooleanField(term55537, term55537.getClass(), "canContainInline", false);
        setBooleanField(term55537, term55537.getClass(), "empty", true);
        setBooleanField(term55537, term55537.getClass(), "selfClosing", true);
        setBooleanField(term55537, term55537.getClass(), "preserveWhitespace", false);
        setBooleanField(term55537, term55537.getClass(), "formList", true);
        setBooleanField(term55537, term55537.getClass(), "formSubmit", false);
        setField(term55536, term55536.getClass(), "tag", term55537);
        setField(term55558, term55558.getClass(), "referent", null);
        setField(term55559, term55559.getClass(), "lock", term55560);
        setField(term55559, term55559.getClass(), "head", null);
        setLongField(term55559, term55559.getClass(), "queueLength", 4949335493504695457L);
        setField(term55558, term55558.getClass(), "queue", term55559);
        setField(term55558, term55558.getClass(), "next", null);
        setField(term55558, term55558.getClass(), "discovered", null);
        setField(term55536, term55536.getClass(), "shadowChildrenRef", term55558);
        setField(term55536, term55536.getClass(), "childNodes", term55562);
        setIntField(term55566, term55566.getClass(), "size", 278355793);
        setField(term55566, term55566.getClass(), "keys", term55568);
        setField(term55566, term55566.getClass(), "vals", term55569);
        setField(term55536, term55536.getClass(), "attributes", term55566);
        setField(term55536, term55536.getClass(), "baseUri", "ypEdrstygY");
        setField(term55536, term55536.getClass(), "parentNode", null);
        setIntField(term55536, term55536.getClass(), "siblingIndex", -310648604);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Appendable");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "html", argTypes, term55536, args);
    }

};



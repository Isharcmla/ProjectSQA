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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_html_107840127085 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17113;

    public Element_html_107840127085() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term17135 = new HashMap();
        Set<Object> term17184 =  ((Map) term17135).keySet();
        HashSet term17134 = new HashSet((Collection<? extends Object>) term17184);
        ArrayList term17145 = new ArrayList();
        LinkedHashMap term17150 = new LinkedHashMap();
        term17113 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term17114 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term17149 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term17114, term17114.getClass(), "tagName", "gwTUlYNpjM");
        setBooleanField(term17114, term17114.getClass(), "isBlock", false);
        setBooleanField(term17114, term17114.getClass(), "formatAsBlock", false);
        setBooleanField(term17114, term17114.getClass(), "canContainBlock", false);
        setBooleanField(term17114, term17114.getClass(), "canContainInline", false);
        setBooleanField(term17114, term17114.getClass(), "empty", true);
        setBooleanField(term17114, term17114.getClass(), "selfClosing", false);
        setBooleanField(term17114, term17114.getClass(), "preserveWhitespace", true);
        setField(term17113, term17113.getClass(), "tag", term17114);
        setField(term17113, term17113.getClass(), "classNames", term17134);
        setField(term17113, term17113.getClass(), "parentNode", null);
        setField(term17113, term17113.getClass(), "childNodes", term17145);
        setField(term17149, term17149.getClass(), "attributes", term17150);
        setField(term17113, term17113.getClass(), "attributes", term17149);
        setField(term17113, term17113.getClass(), "baseUri", "LgXdqWrsLL");
        setIntField(term17113, term17113.getClass(), "siblingIndex", -1504890659);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "html", argTypes, term17113, args);
    }

};



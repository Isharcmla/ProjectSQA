package com.fasterxml.jackson.databind;

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
import static com.fasterxml.jackson.databind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static com.fasterxml.jackson.databind.EqualityUtils.*;
import java.util.LinkedList;
import java.lang.Object;

public class JsonMappingException_wrapWithPath_1125529288203 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term385601;
     Object term385729;
     Object term385796;
     Object term385799;
     Object term385787;

    public JsonMappingException_wrapWithPath_1125529288203() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term385601 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term385601, term385601.getClass(), "_path", null);
        term385729 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        term385796 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term385796, term385796.getClass(), "_from", null);
        setField(term385796, term385796.getClass(), "_fieldName", null);
        setIntField(term385796, term385796.getClass(), "_index", 0);
        setField(term385796, term385796.getClass(), "_desc", null);
        Object term385802 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term385803 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term385803, term385803.getClass(), "_from", null);
        setField(term385803, term385803.getClass(), "_fieldName", null);
        setIntField(term385803, term385803.getClass(), "_index", 0);
        setField(term385803, term385803.getClass(), "_desc", null);
        setField(term385802, term385802.getClass(), "_from", term385803);
        setField(term385802, term385802.getClass(), "_fieldName", "");
        setIntField(term385802, term385802.getClass(), "_index", -1);
        setField(term385802, term385802.getClass(), "_desc", null);
        LinkedList term385800 = new LinkedList();
        ((LinkedList) term385800).add(term385802);
        term385799 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term385799, term385799.getClass(), "_path", term385800);
        setField(term385799, term385799.getClass(), "_processor", null);
        setField(term385799, term385799.getClass(), "_location", null);
        setField(term385799, term385799.getClass(), "backtrace", null);
        setField(term385799, term385799.getClass(), "detailMessage", null);
        setField(term385799, term385799.getClass(), "cause", null);
        setField(term385799, term385799.getClass(), "stackTrace", null);
        setIntField(term385799, term385799.getClass(), "depth", 0);
        setField(term385799, term385799.getClass(), "suppressedExceptions", null);
        Object term385791 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        Object term385774 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException$Reference"));
        setField(term385774, term385774.getClass(), "_from", null);
        setField(term385774, term385774.getClass(), "_fieldName", null);
        setIntField(term385774, term385774.getClass(), "_index", 0);
        setField(term385774, term385774.getClass(), "_desc", null);
        setField(term385791, term385791.getClass(), "_from", term385774);
        setField(term385791, term385791.getClass(), "_fieldName", "");
        setIntField(term385791, term385791.getClass(), "_index", -1);
        setField(term385791, term385791.getClass(), "_desc", null);
        LinkedList term385788 = new LinkedList();
        ((LinkedList) term385788).add(term385791);
        term385787 = newInstance(Class.forName("com.fasterxml.jackson.databind.JsonMappingException"));
        setField(term385787, term385787.getClass(), "_path", term385788);
        setField(term385787, term385787.getClass(), "_processor", null);
        setField(term385787, term385787.getClass(), "_location", null);
        setField(term385787, term385787.getClass(), "backtrace", null);
        setField(term385787, term385787.getClass(), "detailMessage", null);
        setField(term385787, term385787.getClass(), "cause", null);
        setField(term385787, term385787.getClass(), "stackTrace", null);
        setIntField(term385787, term385787.getClass(), "depth", 0);
        setField(term385787, term385787.getClass(), "suppressedExceptions", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.fasterxml.jackson.databind.JsonMappingException");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Throwable");
        argTypes[1] = Class.forName("java.lang.Object");
        argTypes[2] = Class.forName("java.lang.String");
        Object[] args = new Object[3];
        args[0] = term385601;
        args[1] = term385729;
        args[2] = "";
        Object retValue = callMethod(klass, "wrapWithPath", argTypes, null, args);
        assertTrue(recursiveEquals(term385601, term385796));
        assertTrue(recursiveEquals(term385729, ""));
        assertTrue(recursiveEquals(retValue, term385787));
    }

};



package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class ReturnsDeepStubsTest {

    public interface City {
        String getName();
        int getZipCode();
    }

    public interface Address {
        City getCity();
        String getStreet();
    }

    public interface Person {
        Address getAddress();
        String getName();
        int getAge();
        boolean isActive();
        <T extends Comparable<T> & Cloneable> T getSpecial();
    }

    public interface GenericContainer<T> {
        T getItem();
    }

    public interface NestedGenericService {
        GenericContainer<List<String>> getContainer();
    }

    public static final class FinalClass {
        public String getValue() {
            return "final";
        }
    }

    public interface ServiceWithFinalClass {
        FinalClass getFinalClass();
    }

    @Test
    public void testAnswer_deepStubChain_returnsNestedMock() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = Mockito.mock(Person.class, answer);

        Address address = person.getAddress();
        assertNotNull(address);

        City city = address.getCity();
        assertNotNull(city);

        assertEquals("", city.getName());
        assertEquals(0, city.getZipCode());
    }

    @Test
    public void testAnswer_repeatedInvocation_returnsSameMockInstance() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = Mockito.mock(Person.class, answer);

        Address address1 = person.getAddress();
        Address address2 = person.getAddress();
        assertSame(address1, address2);

        City city1 = address1.getCity();
        City city2 = address1.getCity();
        assertSame(city1, city2);
    }

    @Test
    public void testAnswer_unmockableTypes_returnsDefaultValues() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = Mockito.mock(Person.class, answer);

        assertEquals("", person.getName());
        assertEquals(0, person.getAge());
        assertEquals(false, person.isActive());
    }

    @Test
    public void testAnswer_unmockableFinalClass_returnsNull() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        ServiceWithFinalClass service = Mockito.mock(ServiceWithFinalClass.class, answer);

        assertNull(service.getFinalClass());
    }

    @Test
    public void testAnswer_extraInterfacesGenericBounds_createsMockWithExtraInterfaces() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = Mockito.mock(Person.class, answer);

        Object special = person.getSpecial();
        assertNotNull(special);
        assertTrue(special instanceof Comparable);
        assertTrue(special instanceof Cloneable);
    }

    @Test
    public void testAnswer_nestedGenericTypes_resolvesCorrectly() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        NestedGenericService service = Mockito.mock(NestedGenericService.class, answer);

        GenericContainer<List<String>> container = service.getContainer();
        assertNotNull(container);

        List<String> list = container.getItem();
        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    public void testAnswer_stubbedDeepInvocation_returnsStubbedValue() {
        Person person = Mockito.mock(Person.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(person.getAddress().getCity().getName()).thenReturn("Bangkok");

        assertEquals("Bangkok", person.getAddress().getCity().getName());
    }

    @Test
    public void testActualParameterizedType_withMock_returnsGenericMetadata() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        Person person = Mockito.mock(Person.class, answer);

        GenericMetadataSupport metadata = answer.actualParameterizedType(person);
        assertNotNull(metadata);
        assertEquals(Person.class, metadata.rawType());
    }

    @Test(expected = NotAMockException.class)
    public void testActualParameterizedType_nonMockObject_throwsNotAMockException() {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        answer.actualParameterizedType("not-a-mock");
    }

    @Test(expected = RuntimeException.class)
    public void testAnswer_nullInvocation_throwsException() throws Throwable {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        answer.answer(null);
    }

    @Test
    public void testSerialization_returnsDeepStubsInstance_serializable() throws Exception {
        ReturnsDeepStubs answer = new ReturnsDeepStubs();
        byte[] serialized = serialize(answer);
        Object deserialized = deserialize(serialized);

        assertNotNull(deserialized);
        assertTrue(deserialized instanceof ReturnsDeepStubs);
    }

    @Test
    public void testSerialization_deepStubMock_serializableAndFunctional() throws Exception {
        Person person = Mockito.mock(Person.class, Mockito.RETURNS_DEEP_STUBS);
        Address address = person.getAddress();
        assertNotNull(address);

        byte[] serialized = serialize(person);
        Person deserializedPerson = (Person) deserialize(serialized);

        assertNotNull(deserializedPerson);
        assertNotNull(deserializedPerson.getAddress());
        assertEquals("", deserializedPerson.getAddress().getStreet());
    }

    @Test
    public void testSerializationFallback_writeReplace_returnsMockitoReturnsDeepStubs() throws Exception {
        Person person = Mockito.mock(Person.class, Mockito.RETURNS_DEEP_STUBS);
        Address address = person.getAddress();
        byte[] serialized = serialize(address);
        Address deserializedAddress = (Address) deserialize(serialized);

        assertNotNull(deserializedAddress);
        City city = deserializedAddress.getCity();
        assertNotNull(city);
    }

    private static byte[] serialize(Object obj) throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(obj);
        oos.close();
        return baos.toByteArray();
    }

    private static Object deserialize(byte[] bytes) throws Exception {
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bais);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }
}

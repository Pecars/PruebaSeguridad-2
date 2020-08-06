<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<jsp:include page="plantillas/nav.jsp"></jsp:include>

<div id="page-wrapper">
	<div class="row">
		<div class="col-lg-10">
			<h1 class="page-header">Empresas</h1>
		</div>
		<div class="col-lg-2">

			<a href="mantencioninfocliente"><button
					class="btn btn-success page-header">Agregar Nuevo</button></a>
		</div>
		<br>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->
	<div class="row">
		<div class="col-lg-12">
			<div class="panel panel-default">
				<div class="panel-heading">DataTables Advanced Tables</div>
				<!-- /.panel-heading -->
				<div class="panel-body">
					<table width="100%"
						class="table table-striped table-bordered table-hover"
						id="dataTables-example">
						<thead>
							<tr>
								<th>Empresa</th>
								<th>Representante</th>
								<th>Rut</th>
								<th>Direccion</th>
								<th>Fono</th>
								<th>Correo</th>
								<th>Giro</th>
								<th>Fecha ingreso</th>
								<th>Trabajadores</th>
								<th>Acciones</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${listado}" var="obj">
								<tr class="odd gradeX">
									<td><c:out value="${obj.nombreEmp}"/></td>
									<td><c:out value="${obj.representanteEmp}"/></td>
									<td><c:out value="${obj.rutEmp}"/></td>
									<td><c:out value="${obj.direccionEmp}"/></td>
									<td><c:out value="${obj.telEmp}"/></td>
									<td><c:out value="${obj.correoEmp}"/></td>
									<td><c:out value="${obj.giroEmp}"/></td>
									<td><c:out value="${obj.fechaIngresoEmp}"/></td>
									<td><c:out value="${obj.numeroTrabajadoresEne}"/></td>
									<td align="center">
										<div class="btn-group">
											<a href="editaremp/${obj.idEmp}"><button class="btn btn-warning">
												<i class="fa fa-pencil"></i>
											</button></a>
											<a onclick="eliminaremp([[${obj.idEmp}]])"><button class="btn btn-danger">
												<i class="fa fa-times"></i>
											</button></a>

										</div>
								</tr>
							</c:forEach>						
						</tbody>
					</table>
					<!-- /.table-responsive -->
					
				</div>
				<!-- /.panel-body -->
			</div>
			<!-- /.panel -->
		</div>
		<!-- /.col-lg-12 -->
	</div>
	<!-- /.row -->

</div>
<!-- /#page-wrapper -->

<jsp:include page="plantillas/scripts.jsp"></jsp:include>